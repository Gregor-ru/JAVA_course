public class DecodeExample {
    public static void main(String[] args) {
        // Примеры использования метода decode()
        Integer decimal = Integer.decode("123"); // Десятичное число
        Integer hex = Integer.decode("0x1A");   // Шестнадцатеричное число
        Integer octal = Integer.decode("012");  // Восьмеричное число

        System.out.println("Десятичное: " + decimal);
        System.out.println("Шестнадцатеричное: " + hex);
        System.out.println("Восьмеричное: " + octal);
    }
}
