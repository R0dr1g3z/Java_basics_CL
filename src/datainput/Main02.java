package datainput;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        operations();
    }

    public static void operations(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int number1 = scan.nextInt();
        System.out.println("Podaj druga liczbe");
        int number2 = scan.nextInt();
        System.out.println("Wynik dodawania: " + (number1 += number2));
        System.out.println("Wynik odejmowania: " + (number1 -= number2));
        System.out.println("Wynik mnozenia: " + (number1 * number2));
        System.out.println("Wynik dzielenia: " + (number1 / number2));
    }
}
