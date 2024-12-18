class A {
    int a;
    int b;
    int c;
    int z;

    // Конструктор без параметров
    public A() {
        this(0, 0, 0);  // Вызов другого конструктора с тремя параметрами
        z = 1;
    }

    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0, 0);  // Вызов другого конструктора с двумя параметрами
        z = 1;
    }

    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0);  // Вызов другого конструктора с одним параметром
        z = 1;
    }

    // Конструктор с тремя параметрами
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A();  // Вызов конструктора без параметров
        A a2 = new A(10);  // Вызов конструктора с одним параметром
        A a3 = new A(10, 20);  // Вызов конструктора с двумя параметрами
        A a4 = new A
