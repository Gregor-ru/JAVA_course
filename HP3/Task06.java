public class NarrowingConversion {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i; // Явное сужающее преобразование
        System.out.println("byte: " + b);
    }
}
