import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class HuffmanFileIO {

    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Path.of(filePath)));
    }

    public void writeFile(String filePath, String content) throws IOException {
        Files.write(Path.of(filePath), content.getBytes(), 
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}