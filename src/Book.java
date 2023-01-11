public class Book {
    String author = "Jules Verne";
    String title = "Ocolul pamantului in 80 de zile";
    double price = 50.00;

    public double getPrice(){
        return price;

    }

    public String showAuthorAndTitle(){
        return ("Cartea "+title+" este scrisa de catre "+author);

    }

    public static void showILoveBooks(){
        System.out.println("I Love Books");
    }
}
