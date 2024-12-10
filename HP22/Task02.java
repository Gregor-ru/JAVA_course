class A {
    int a = 10;

    void method() {
        System.out.println("Метод суперкласса A");
    }
}

class B extends A {
    // В классе B нет переменной a и метода method()
}

class C extends B {
    void method() {
        // Доступ к переменной a из класса A через super
        int aValue = super.a;
        System.out.println("Переменная a из суперкласса A: " + aValue);
        
        // Вызов метода method() из класса A через super
        super.method();
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}
