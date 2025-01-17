import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Client.NumInvalideException, IOException {
        Client c1 = new Client(1,"mohamed","some@gmail.com");
        Date d1 = new Date("17/01/2025");
        Commande com1 = new Commande("1",d1,c1);
        Article a1 = new Article("1","7lib",5);
        Article a2 = new Article("2","lbn",50);
        Article a3 = new Article("3","jbn",20);
        com1.addArt(a1);
        com1.addArt(a2);
        com1.addArt(a3);
        com1.saveArticles("C:\\Users\\Mohamed\\Documents\\saveArticles_BTS_ex23\\articles.txt");
        //System.out.println(com1.toString());;


    }
}