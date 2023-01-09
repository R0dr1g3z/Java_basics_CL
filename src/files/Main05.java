package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main05 {
    public static void main(String[] args) throws IOException {
        System.out.println(count("michal/TestFile3.txt"));
    }

    public static int count(String filename) throws IOException{
        Path path = Paths.get(filename);
        int counter = 0;
        List<String> list = Files.readAllLines(path);
        for (String s : list){
            counter += s.replaceAll("\\s+", "").split("").length;
        }
        return counter;
        
    }
}
