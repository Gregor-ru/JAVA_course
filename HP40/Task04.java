import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);  // Преобразуем байт в символ и выводим
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Интерфейс AutoCloseable позволяет автоматическое освобождение ресурсов в блоке try-with-resources.
}
