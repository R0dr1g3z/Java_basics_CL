package datainput;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int num = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("x ");
            System.out.println(sb);
        }
    }
}
