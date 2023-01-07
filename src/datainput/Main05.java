package datainput;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        textLines();
    }

    public static void textLines() {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String text = scan.nextLine();
            if (text.equals("quit")) {
                break;
            } else
                sb.append(text + " ");
        }
        System.out.println(sb);
    }
}
