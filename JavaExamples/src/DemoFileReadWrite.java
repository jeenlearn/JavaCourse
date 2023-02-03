import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFileReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/textfile");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);
        String newFileContent = fileContent.replace("line","lines");
        Path newPath = Paths.get("./resources/textfile-new");
        Files.writeString(newPath,newFileContent);
    }

}
