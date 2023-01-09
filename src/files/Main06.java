package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(checkFileExists());
    }

    public static boolean checkFileExists(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku");
        String str = scan.next();
        Path path = Paths.get(str);
        if (Files.exists(path)){
            return true;
        }
        return false;
    }
}
