public class SmartphoneIOS extends Smartphone {
    public SmartphoneIOS(String marca, String pret) {
        super(marca, pret);

    }

    public void sePornesteIOS(){
        System.out.println("iPhone porneste");

    }

    @Override
    void porneste() {
        System.out.println("iPhone porneste");

    }

    @Override
    void seOperste() {
        System.out.println("iPhone se opreste");

    }
    public void pret(){
        System.out.println(super.pret);

        }
    }


