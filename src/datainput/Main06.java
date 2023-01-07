package datainput;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        delta();
    }

    public static void delta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scan.nextInt();
        System.out.println("Podaj b");
        int b = scan.nextInt();
        System.out.println("Podaj c");
        int c = scan.nextInt();
        int delt = (b * b) - 4 * a * c;
        System.out.println("Delta wynosi: " + delt);
    }
}
