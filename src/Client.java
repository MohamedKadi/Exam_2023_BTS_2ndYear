public class Client implements Comparable, Cloneable{
    private int num;
    private String nom,email;

    public static class NumInvalideException extends Exception{
        public NumInvalideException(String s){
            super(s);
        }
    }
    public Client(int num, String nom, String email) throws NumInvalideException{

        if(num < 0){
            throw new NumInvalideException("num is negative!!");
        }
        this.num = num;
        this.nom = nom;
        this.email = email;
    }

    @Override
    public boolean equals(Object ob){
        return this.num == ((Client) ob).num;
    }
    @Override
    public String toString(){
        return "Client Numero : " + num + ", nom : "+nom+",Email : "+email;
    }
    @Override
    public int compareTo(Object ob){
        Client c1 = (Client) ob;
        if(num > c1.num){
            return 1;
        }else if(num == c1.num){
            return 0;
        }else {
            return -1;
        }
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
