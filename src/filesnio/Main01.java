package filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {
    public static void main(String[] args) {
        try {
            createDirectory("michal");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDirectory(String directoryName) throws IOException{
        Path path = Paths.get(directoryName);

        if(!Files.exists(path)){
            Files.createDirectory(path);
        }
    }
}
