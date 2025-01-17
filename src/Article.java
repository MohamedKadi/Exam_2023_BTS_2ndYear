import java.io.Serializable;

public class Article implements Serializable {
    private String code, libelle;
    private float prix;
    public Article(String code, String libelle, float prix){
        this.code = code;
        this.libelle = libelle;
        this.prix = prix;
    }
    public String getCode(){
        return code;
    }
    public String getLibelle(){
        return libelle;
    }
    public float getPrix(){
        return prix;
    }
    @Override
    public String toString(){
        return "Code : "+code+", libellé : "+libelle+", Prix : "+prix;
    }
    public String toXML(){
        return "<article>\n"
                +"\t<code> "+code+"</code>\n"
                +"\t<libelle>"+libelle+"</libelle>\n"
                +"\t<prix>"+prix+"</prix>\n"
                +"</article>\n";
    }
}
