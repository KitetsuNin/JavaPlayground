import java.util.Scanner;

public class ScanNums {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insert whole number");
        int i = scan.nextInt();
        System.out.println("Insert real number");
        double d = scan.nextDouble();
        System.out.println("inserted" + i + " " + d);
    }
}
