package datainput;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        rowsColumns();
    }

    public static void rowsColumns(){
        int counter = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int rows = scan.nextInt();
        System.out.println("Podaj druga liczbe");
        int columns = scan.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter++;
                arr[i][j] = counter;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Suma wszystkich liczb w tablicach: " + sum);
        System.out.println("Srednia wszystkich liczb w tablicach: " + (sum / counter));
    }
}
