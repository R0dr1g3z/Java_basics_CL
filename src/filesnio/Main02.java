package filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {
    public static void main(String[] args) throws IOException {
        createFile("michal/TestFile.txt");
    }

    public static void createFile(String fileName) throws IOException{
        Path path = Paths.get(fileName);
        if (!Files.exists(path)){
            Files.createFile(path);
        }
    }
}
