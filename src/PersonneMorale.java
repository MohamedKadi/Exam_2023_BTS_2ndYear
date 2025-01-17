public class PersonneMorale extends Client{
    private String numContrat;
    public PersonneMorale(int num,String nom,String email,String numContrat) throws Client.NumInvalideException{
        super(num,nom,email);
        this.numContrat=numContrat;
    }
    @Override
    public String toString(){
        return super.toString() + ", N dde contract : "+numContrat;
    }
}
