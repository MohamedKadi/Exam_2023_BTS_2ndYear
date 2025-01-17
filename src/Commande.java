import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Commande {
    private String numCmd;
    private Date dateCmd;
    private Client cli;
    private ArrayList<Article> listeArt;

    public Commande(String numCmd,Date dateCmd,Client cli){
        this.numCmd = numCmd;
        this.dateCmd = dateCmd;
        this.cli = cli;
        listeArt = new ArrayList<>();
    }
    public boolean addArt(Article art){
        try{
            listeArt.add(art);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public Article delArt(String code){
        for(Article art : listeArt){
            if(art.getCode() == code){
                listeArt.remove(code);
                return art;
            }
        }
        return null;
    }
    public Article delArt(int code){
        return listeArt.remove(code);
    }
    public Article updateArt(int index, Article newArt){
        if(index > listeArt.size() || index < 0){
            return null;
        }
        return listeArt.set(index,newArt);
    }
    @Override
    public String toString(){
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        String wholeArticles = "";
        int count = 0;
        for(Article art : listeArt){
            count++;
            wholeArticles+=count+"- "+ art.toString() + "\n";
        }
        return "Numero Commande : "+numCmd+", Date Commande : "+dtf.format(dateCmd)+"\n"
                +cli.toString()+"\n"
                +"liste des articles : \n"
                + wholeArticles;
    }
    public boolean saveArticles(String file) throws IOException {
        File f = new File(file);
        FileWriter fw = new FileWriter(f);

        String s = "";
        for(Article art : listeArt){
            s+=art.toXML();
        }
        s = "<commande num=\""+numCmd+"\">\n"+s+"</commande>";
        fw.write(s);
        fw.flush();
        return true;
    }
}
