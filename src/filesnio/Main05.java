package filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main05 {
    public static void main(String[] args) throws IOException {
        readFromFile("michal/CopyThisFile.txt");
    }

    public static void readFromFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Path path2 = Paths.get(fileName.substring(0, fileName.length() - 3) + "html");
        List<String> lines = Files.readAllLines(path);
        Files.createFile(path2);
        Files.write(path2, lines);
    }
}