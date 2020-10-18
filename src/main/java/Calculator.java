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


import java.util.Scanner;

/**
 * Do math tasks.
 */
public class Calculator {

    private static final double PI = 3.14;

    //methods
    double add(double number1, double number2) {
        return number1 + number2;
    }

    double subtract(double number1, double number2) {
        return number1 - number2;
    }

    double multiply(double number1, double number2) {
        return number1 * number2;
    }

    int divide(int number1, int number2) {
        return number1 / number2;
    }

    double addByPi(double number1) {
        return number1 + PI;
    }

    double subtractByPi(double number1) {
        return number1 - PI;
    }

    double multiplyByPi(double number1) {
        return number1 * PI;
    }

    double divideByPi(double number1) {
        return number1 / PI;
    }
}
