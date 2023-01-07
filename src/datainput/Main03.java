package datainput;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        getData();
    }

    public static void getData(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("Wpisz 0 zeby dodac liczby");
        while (scan.hasNextInt()){
            i = scan.nextInt();
            if (i == 0){
                break;
            } else
            sum += i;
        }
        System.out.println("Wynik dodawania: " + sum);
    }
}
