public class A {
    public final int a;

    // Конструктор класса A для инициализации final переменной
    public A(int value) {
        this.a = value;  // Инициализация в конструкторе
    }

    public static void main(String[] args) {
        // Вариант 1: Инициализация через конструктор
        A obj1 = new A(5);  // Инициализация final переменной через конструктор

        // Вариант 2: Инициализация в месте объявления
        A obj2 = new AWithDirectInitialization(10); // Инициализация через статический блок
        System.out.println("obj1.a: " + obj1.a); // 5
        System.out.println("obj2.a: " + obj2.a); // 10
    }
}

// Вариант 2: Инициализация через статический блок
class AWithDirectInitialization {
    public final int a = 10;  // Инициализация в месте объявления

    public AWithDirectInitialization(int value) {
        // В месте объявления уже инициализировали
    }
}
