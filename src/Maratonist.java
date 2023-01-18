public class Maratonist extends Sportiv {
    public Maratonist(String proba, String tara) {
        super(proba, tara);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Maratonistul se antreneaza");
    }

    public void seOdihneste() {
        System.out.println("Maratonul se odihneste");

    }

}