public class DiskTest {
    public static void main(String [] args) {
        Disk.setVat(23.0);
        Disk d1 = new Disk("Seagate Barracuda", 500, 200);
        System.out.println(d1.getDescription() + " - cena " + d1.getBruttoPrice() + " zł");
    }
}
