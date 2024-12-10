import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Выводим приветственное сообщение
        System.out.println("Привет, " + name + "!");
        
        // Закрываем Scanner
        scanner.close();
    }
}
