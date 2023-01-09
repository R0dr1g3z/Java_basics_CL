package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("michal/text4.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            if (data.toLowerCase().contains("javy")) {
                System.out.println(data);
            }
        }
    }
}