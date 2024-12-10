public class ConditionalOperatorExample {
    public static void main(String[] args) {
        int a = 2; // Пример значения переменной a
        int i;

        // Использование тернарного оператора
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        // Вывод результата
        System.out.println("Значение i: " + i);
    }
}
