import java.util.Scanner;

public class Calc {
    public static void main (String args[]) {
    Scanner dupa = new Scanner(System.in);
    double liczba1, liczba2, suma, roznica, iloczyn, iloraz;

        System.out.println("Podaj pierwsza liczbe:");
        liczba1 = dupa.nextDouble();
        System.out.println("Podaj druga liczbe");
        liczba2 = dupa.nextDouble();
        suma = liczba1 + liczba2;
        roznica = liczba1 - liczba2;
        iloczyn = liczba1 * liczba2;
        iloraz = liczba1 / liczba2;

        System.out.println("liczba1 + liczba2 = " + suma);
        System.out.println("liczba1 - liczba2 = " + roznica);
        System.out.println("liczba1 * liczba2 = " + iloczyn);
        System.out.println("liczba1 / liczba2 = " + iloraz);
    }
}
