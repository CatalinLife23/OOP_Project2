public class Persoana {
    String nume;
    String prenume;
    int varsta;

    String gen ;

    public Persoana(String nume, String prenume, int varsta, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
    }

    Persoana(){
        gen = "m";
        prenume = "unknown";
        nume = "unknown";
        varsta = 0;

    }
    //this se refera la atributul din clasa curenta
    Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;

    }
}
