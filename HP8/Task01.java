public class SwitchVariableTypes {
    public static void main(String[] args) {
        // Пример с int
        int intValue = 2;
        switch (intValue) {
            case 1:
                System.out.println("int: value is 1");
                break;
            case 2:
                System.out.println("int: value is 2");
                break;
            default:
                System.out.println("int: value is something else");
        }

        // Пример с char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("char: value is A");
                break;
            case 'B':
                System.out.println("char: value is B");
                break;
            default:
                System.out.println("char: value is something else");
        }

        // Пример с String
        String stringValue = "Hello";
        switch (stringValue) {
            case "Hello":
                System.out.println("String: value is Hello");
                break;
            case "World":
                System.out.println("String: value is World");
                break;
            default:
                System.out.println("String: value is something else");
        }

        // Пример с Enum
        Day dayValue = Day.MONDAY;
        switch (dayValue) {
            case MONDAY:
                System.out.println("Enum: value is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Enum: value is TUESDAY");
                break;
            default:
                System.out.println("Enum: value is something else");
        }
    }

    // Перечисление для примера с Enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}
