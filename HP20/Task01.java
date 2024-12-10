class Parent {
    void method() {
        System.out.println("Метод суперкласса");
    }

    Parent() {
        System.out.println("Конструктор суперкласса");
    }
}

class Child extends Parent {
    void method() {
        super.method(); // Вызов метода суперкласса
        System.out.println("Метод подкласса");
    }

    Child() {
        super(); // Вызов конструктора суперкласса
        System.out.println("Конструктор подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(); // Вызывает конструкторы суперкласса и подкласса
        child.method(); // Вызов метода суперкласса и подкласса
    }
}
