public class BasicTypesExample {
    public static void main(String[] args) {
        // Целочисленные
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0L;

        // С плавающей точкой
        float floatValue = 0.0f;
        double doubleValue = 0.0;

        // Символьный
        char charValue = '\u0000'; // Нулевой символ в Unicode

        // Булевский
        boolean boolValue = false;

        // Печать нулевых значений
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: '" + charValue + "'");
        System.out.println("boolean: " + boolValue);
    }
}
