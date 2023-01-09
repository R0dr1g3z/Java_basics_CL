package filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main03 {
    public static void main(String[] args) throws IOException {
        copyFile("michal", "TestFile.txt", "TestFile2.txt");
    }

    public static void copyFile(String directory, String fileName, String secondFileName) throws IOException{
        Path path1 = Paths.get(directory, fileName);
        Path path2 = Paths.get(directory, secondFileName);
        Files.copy(path1, path2);
    }
}
