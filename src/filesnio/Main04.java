package filesnio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) throws IOException {
        writeToFile("michal/TestWriteFile.txt");
    }

    public static void writeToFile(String fileName) throws IOException {
        Scanner scan = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
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
