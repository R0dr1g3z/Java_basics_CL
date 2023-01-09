package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("michal/text3.txt");
        double sum = 0;
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            String[] split = data.split(",");
            for (int i = 0; i < split.length; i++) {
                try {
                    sum += Double.parseDouble(split[i]);
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.println(sum);
    }
}
