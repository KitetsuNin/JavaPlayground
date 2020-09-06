public class Homework3 {

    public static void main(String[] args) {
        char c = 'a';
        int kod = c;
        System.out.println("kod znaku " + c + " = " + kod);
        kod = 77;
        c = (char) kod;
        System.out.print("Kod znaku " + c + " = " + kod);
        // Czasem trzeba użyć jawnej konwersji rozszerzającej

        System.out.println("Kod znaku " + '*' + " = " + (int) '*');
        // Oczywiście - zawężające zawsze trzeba podawać jawnie
        System.out.println("Kod znaku " + (char) 66 + " = " + 66);
        // No i skoro dane typu char mogą być traktowane jako liczby, to:
        char b = 'a' + 1;
        System.out.println(b + " - " + (int) b);
        System.out.println(++b + " - " + (int) b);
    }
}
