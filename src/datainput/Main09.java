package datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        try {
            getNumber();
        } catch (InputMismatchException e){
            System.out.println("To nie jest liczba");
        }
    }

    public static void getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int num = scan.nextInt();
        System.out.println("Twoja liczba to " + num);
    }
}
