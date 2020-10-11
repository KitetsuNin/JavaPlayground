public class JournalTest {
    public static void main (String[] args){
        Journal j1 = new Journal(10, "xaaf", "dasdasd", 2019, "sadsa", 9, 100);
        Journal j2 = new Journal(11, "sadasd", "safsaf", 2020, "sadf", 7.5, 90);


    }
    public double incomeDifference(Publication p1, Publication p2){
        double income1 = p1.getQuantity() * p1.getPrice();
        double income2 = p2.getQuantity() * p2.getPrice();
        return income1 - income2;
    }


}
