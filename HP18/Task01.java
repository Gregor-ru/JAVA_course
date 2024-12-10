public class Printer {
    
    // Метод с переменным числом целочисленных параметров
    public static void printNumbers(int... numbers) {
        System.out.println("Printing numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Перегрузка метода для печати строк
    public static void printNumbers(String... strings) {
        System.out.println("Printing strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Перегрузка метода для печати чисел и строк
    public static void printNumbers(int num, String... strings) {
        System.out.println("Printing integer followed by strings:");
        System.out.println("Integer: " + num);
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // Вызов метода с переменным числом целочисленных параметров
        printNumbers(1, 2, 3, 4, 5);
        
        // Вызов перегруженного метода для строк
        printNumbers("Hello", "World");

        // Вызов перегруженного метода с целым числом и строками
        printNumbers(42, "Java", "is", "awesome");
    }
}
