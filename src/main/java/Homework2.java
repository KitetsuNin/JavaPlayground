public class Homework2 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = b = c * 1 + 2;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a = b = c * (1 + 2);
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a = b++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        c = --b;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a++;
        b++;
        c++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

        a = b++ * ++c;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

        int DlugaNazwaZmiennej = 20;
        DlugaNazwaZmiennej = DlugaNazwaZmiennej * 10;
        DlugaNazwaZmiennej *= 10;
        System.out.println(DlugaNazwaZmiennej);


        //====================================================


        int n = 41; // liczba klocków
        int s = 7; // ile klocków mieści się w pojemniku

        // jeżeli wszystkie pojemniki są pełne pokazuje
        // również, ile jest klocków w ostatnim z nich
        // wykorzystamy tę zmienną do pokazania
        // ile jest klocków w ostatnim pojemniku

        int pojemnik = n / s; // liczba pojemników początkowo pełnych
        int rest = n % s; // reszta z dzielenia pokazuje czy jest dodatkowy pojemnik i ile jest w nim klocków
        if (rest != 0) { //jeżeli jest dodatkowy pojemnik
            pojemnik++; //liczba pojemników +1
            s = rest; // zmieniamy wartość s - ostatni pojemnik niepełny!
        }

        System.out.print("liczba pojemników :" + pojemnik);
        System.out.print("Liczba klocków w ostatnim pojemniku " + s);


        //===============================================


    }
}
