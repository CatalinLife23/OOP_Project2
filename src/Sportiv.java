abstract class Sportiv {
    public String proba;
    public String tara;

    public Sportiv(String proba, String tara) {
        this.proba = proba;
        this.tara = tara;
    }

    abstract void seAntreneaza();
        public void seOdihneste(){
            System.out.println("Sportivul se odihneste");


        }
    }

