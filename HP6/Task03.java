public class BoxingUnboxingExample {
    public static void main(String[] args) {
        Integer nullInteger = null;

        try {
            int value = nullInteger; // Автораспаковка null -> NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при автораспаковке null значения!");
        }
    }
}
