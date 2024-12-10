public class BooleanExample {
    public static void main(String[] args) {
        // Создание объектов класса Boolean
        Boolean bool1 = Boolean.valueOf(true);         // Через valueOf(type)
        Boolean bool2 = Boolean.valueOf("true");       // Через valueOf(String)
        Boolean bool3 = Boolean.parseBoolean("false"); // Через parseBoolean(String)

        // Автоупаковка
        Boolean bool4 = true; // Boxing

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
    }
}
