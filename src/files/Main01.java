package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) throws IOException {
        consolePrint();
    }

    public static void consolePrint() throws IOException {
        Scanner scan = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("michal/text1.txt", true)) {
            while (true) {
                String data = scan.nextLine();
                if (data.equals("quit")) {
                    break;
                }
                fileWriter.append(data + "\n");
            }
        }
    }
}
