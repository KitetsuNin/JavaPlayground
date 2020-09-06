public class Publication {


    private String title;
    private String publisher;
    private int year;
    private String ident;
    private double price;
    private int quantity;

    public Publication(String t, String pb, int y,String i, double pr, int q) {
        title = t;
        publisher = pb;
        year = y;
        ident = i;
        price = pr;
        quantity = q;

        Publication b = new Publication("Psy", "Dog & Sons", 2002, "ISBN6789", 21.0, 0);



        }

    public String getTitle() { // ciało (body}
        return title;

    }

    }

