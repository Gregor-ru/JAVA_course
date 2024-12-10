public class TypeCasting {
    public static void main(String[] args) {
        int a = 120;
        // byte b = a + 10; // Ошибка компиляции: результат int не помещается в byte
        byte c = (byte) (a + 10); // Явное приведение
        byte d = (byte) (a + 1); // Явное приведение

        System.out.println("c: " + c); // c: -126 (переполнение)
        System.out.println("d: " + d); // d: -127 (переполнение)
    }
}
