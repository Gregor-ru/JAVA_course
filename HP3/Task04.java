public class StringConcatenation {
    public static void main(String[] args) {
        String text = "Результат: ";
        int number = 10;
        double decimal = 5.5;

        // Конкатенация строки с числами
        String result = text + number + ", " + decimal;

        System.out.println(result); // Результат: 10, 5.5
    }
}
