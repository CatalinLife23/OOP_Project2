public class SmartphoneAndroid extends Smartphone{
    public SmartphoneAndroid(String marca, String pret) {
        super(marca, pret);
    }

    public void sePornesteAndroid(){
        System.out.println("Telefonul Android porneste");
    }

    @Override
    void porneste() {
        System.out.println("Xiaomi porneste");

    }

    @Override
    void seOperste() {
        System.out.println("Xiaomi se opreste");

    }
}
