public class Publication {


        private String title;
        private String publisher;
        private int year;
        private  String ident;
        private double price;
        private int quantity;

    public Publication (String tit, String pub, int y, String id, double cost, int q) {
        title = tit;
        publisher = pub;
        year = y;
        ident = id;
        price = cost;
        quantity = q;
    }
        public String getTitle(){
        return title;
        }
        public String getPublisher(){
        return publisher;
        }
        public int getYear(){
        return year;
        }
        public String getIdent(){
        return ident;
        }
        public double getPrice(){
        return price;
        }
        public int getQuantity(){
        return quantity;
        }
        public void buy(int n){
        quantity +=n;
        }
        public void sell(int n){
        quantity -=n;
        }
}


