public class Main3 {

    public static void main(String[] args) {
        Publication book = new Publication("harry potter", "wydawnictwo", 2012, "ISBN1111", 10.2, 15);

        double price = book.getPrice();
        System.out.println(price);

        Publication book2 = new Publication("hari pota", "oko", 2020, "asdasd", 18.5);
        int quantity = book2.getQuantity();
        System.out.println(quantity);
        System.out.println(Publication.dupa);
        Publication.dupa = "siusiak";
        System.out.println(book.dupa);
        System.out.println(book2.dupa);

        book.setPrice(15);

        double price1 = book.getPrice();
        System.out.println(price1);
    }
}
