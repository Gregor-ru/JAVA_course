class A {
    int a = 10;
    
    // Конструктор суперкласса
    A() {
        System.out.println("Конструктор класса A");
    }
    
    void method() {
        System.out.println("Метод суперкласса A");
    }
}

class B extends A {
    int a = 20;

    // Конструктор класса B
    B() {
        super(); // Вызов конструктора суперкласса A
        System.out.println("Конструктор класса B");
    }

    void method() {
        super.method(); // Вызов метода суперкласса A
        System.out.println("Метод класса B");
    }

    void printFields() {
        System.out.println("a в классе B: " + this.a); // Обращение к полю класса B
        System.out.println("a в классе A: " + super.a); // Обращение к полю класса A
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.method();
        b.printFields();
    }
}
