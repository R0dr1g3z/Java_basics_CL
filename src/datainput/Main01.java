package datainput;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        getInfo();
    }

    public static void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name = scan.nextLine();
        System.out.println("Podaj swoj wiek");
        int age = scan.nextInt();
        System.out.println(name + " ma " + age + " lat");
    }
}
