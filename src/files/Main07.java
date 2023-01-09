package files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) throws IOException {
        try {
            rewrite();
        } catch (NoSuchFileException e) {
            System.out.println("Taki plik nie istnieje");
        }
    }

    public static void rewrite() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz nazwe pliku");
        String fileName = scan.next();
        String[] split = fileName.split("\\.");
        List<String> list = Files.readAllLines(Paths.get(fileName));
        String fileNameRewrite = split[0] + "_2." + split[1];
        try (FileWriter fileWriter = new FileWriter(fileNameRewrite)) {
            for (String s : list) {
                fileWriter.append(s + "\n");
            }
        }
    }
}