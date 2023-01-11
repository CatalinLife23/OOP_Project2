public class Animal {
    String nume = "Homar";
    String culoare = "Rosu";
    boolean vegetarian = false;
    int nrpicioare;
    String undeTraieste;

    public Animal(){
        this.nume = "unknown";
        this.culoare = "unknown";
        this.nrpicioare = 4;

    }

    public Animal(String nume, String culoare, int numarPicioare) {
    }

    public Animal(String nume, String culoare, int nrpicioare, String undeTraieste) {
    }

    public void Animal(String nume, String culoare, boolean vegetarian){
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;


    }
    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    public void mananca(){
        System.out.println(nume+" mananca pesti");

        }
    public void doarme(){
        System.out.println(nume+ " doarme");

        }
    public void afiseaza(){
        System.out.println(nume+ " are culoarea "+culoare);



    }
    private class undeTraieste {

    }
    public String getUndeTraieste() {
        return undeTraieste;
    }


    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public void picioare() {
        System.out.println(nume + " are " + nrpicioare + " picioare");
        if (nrpicioare == 0) {
            System.out.println("Nu are picioare");
        } else if (nrpicioare == 2) {
            System.out.println("Are 2 picioare");
        } else if (nrpicioare == 4) {
            System.out.println("Are 4 picioare");
        } else {
            System.out.println("Are alt numar de picioare");



        }




        }
        }


