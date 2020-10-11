//Klasa kalkulator:
//        metody:
//        - dodaj 2 liczby
//        - odejmij 2 liczby
//        - pomnoz 2 liczby
//        - podziel 2 liczby
//
//        - dodaj liczbe do wartosci pi(2 miejsca po przecinku)
//        - odejmij liczbe od wartosci pi(2 miejsca po przecinku)
//        - pomnoz liczbe przez wartosci pi(2 miejsca po przecinku)
//        - podziel liczbe przez wartosci pi(2 miejsca po przecinku)

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner dupa = new Scanner(System.in);

        double number1;
        double number2;
        double a = 3.14;

        System.out.println("write 1st number");
        number1 = dupa.nextDouble();
        System.out.println("write 2nd number");
        number2 = dupa.nextDouble();

        Addition(number1, number2);
        Substraction(number1, number2);
        Multipication(number1, number2);
        Division(number1, number2);
        PiAddition(number1, a);
        PiSubstraction(number1, a);
        PiMultiplication(number1, a);
        PiDivision(number1, a);
    }

    //methods
    static void Addition(double number1, double number2) {
        System.out.println("addition = " + (number1 + number2));
    }

    static void Substraction(double number1, double number2) {
        System.out.println("substraction = " + (number1 - number2));
    }

    static void Multipication(double number1, double number2) {
        System.out.println("multipication = " + (number1 * number2));
    }

    static void Division(double number1, double number2) {
        System.out.println("division = " + (number1 / number2));
    }

    static void PiAddition(double number1, double a) {

        System.out.println("pi addition = " + (number1 + a));
    }

    static void PiSubstraction(double number1, double a) {

        System.out.println("pi substraction = " + (number1 - a));
    }

    static void PiMultiplication(double number1, double a) {
        System.out.println("pi multiplication = " + (number1 * a));
    }

    static void PiDivision(double number1, double a) {
        System.out.println("pi division = " + (number1 / a));
    }
}
