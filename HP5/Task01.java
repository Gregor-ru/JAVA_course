public class OperatorsExample {
    public static void main(String[] args) {
        // Операторы + и += с базовыми типами и строками
        int a = 5, b = 10;
        int sum = a + b;
        System.out.println("Сумма: " + sum);

        String str1 = "Hello, ";
        String str2 = "World!";
        String combined = str1 + str2;
        System.out.println("Строка: " + combined);

        String greeting = "Привет";
        greeting += ", Мир!";
        System.out.println("Конкатенация: " + greeting);

        // Операторы == и !=
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("s1 == s2: " + (s1 == s2)); // true, так как ссылки одинаковые
        System.out.println("s1 == s3: " + (s1 == s3)); // false, так как разные объекты

        // Условный оператор ?:
        int max = (a > b) ? a : b;
        System.out.println("Максимум: " + max);

        // Логические операторы && и ||
        boolean condition1 = (a > 0) && (b > 0);
        boolean condition2 = (a > 0) || (b < 0);
        System.out.println("condition1: " + condition1);
        System.out.println("condition2: " + condition2);

        // Операторы ++ и --
        int counter = 0;
        System.out.println("Префиксная ++: " + (++counter)); // Сначала увеличивает, затем возвращает
        System.out.println("Постфиксная ++: " + (counter++)); // Сначала возвращает, затем увеличивает
        System.out.println("Префиксная --: " + (--counter));
        System.out.println("Постфиксная --: " + (counter--));
    }
}
