public class Disk {
    private static double vat;
    private String model;
    private int capacity;
    private double price;

    public Disk (String name, int size, double cost) {

        model = name;
        capacity = size;
        price = cost;
    }

    public String getDescription() {
        return model +", " + capacity + " GB";
    }
    public double getBruttoPrice() {
        return price * (1 + vat / 100);
    }
    public static void setVat(double v) {
        vat = v;
    }
}

