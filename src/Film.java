import java.awt.*;

public class Film {
    private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPentruCopii;

    public static String getUnText() {
        return unText;
    }

    public static void setUnText(String unText) {
        Film.unText = unText;
    }

    public static String unText = "Toate filmele sunt frumoase";

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;


    }

    public Film(){
            this.titlu = "unknown";
            this.anProductie = 2000;
            this.rating = 10;
            this.potrivitPentruCopii = false;
        }

    public Film(String titlu, int anProductie, boolean potrivitPentruCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        //this.rating = rating;
        this.potrivitPentruCopii = potrivitPentruCopii;
        System.out.println("Primul constructor e apelat");

        }


    public void afiseazaDacaEPotrivitPentruCopii() {
        if (this.potrivitPentruCopii){
            System.out.println("Filmul este potrivit pentru copii");
        }
        //System.out.println("Filmul este potrivit pentru copii");


        else {
            System.out.println(this.titlu+" nu este potrivit pentru copii");

        }
    }

    public String afiseazaRating(){
        return (this.titlu+" are rating "+this.rating);

    }

    public static String afiseazaUnText() {
        return (unText);
    }
}
