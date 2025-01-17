public class Main {
    public static void main(String[] args) throws Client.NumInvalideException {
        Client c1 = new Client(-1,"mohamed","some@gmail.com");
        Client c2 = new PersonneMorale(2,"nhyra","some@gmail.com","1234");
        System.out.println(c2.toString());
    }
}