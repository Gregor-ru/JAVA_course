class Calculator {
    // Перегруженный метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));      // Вызовет add(int, int)
        System.out.println(calc.add(2, 3, 4));   // Вызовет add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));  // Вызовет add(double, double)
    }
}
