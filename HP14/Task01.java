public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Вариант 1: Вызов статического метода через имя класса
        A.printVars();

        // Вариант 2: Вызов статического метода через экземпляр класса (не рекомендуется)
        A obj = new A();
        obj.printVars(); // Это будет работать, но вызов через класс более предпочтителен

        // Вариант 3: Статический метод может быть вызван в другом классе
        AnotherClass.callPrintVars();
    }
}

class AnotherClass {
    public static void callPrintVars() {
        // Вызов статического метода из другого класса
        A.printVars();
    }
}
