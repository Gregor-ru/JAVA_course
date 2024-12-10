public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[ ] num = {new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
/*
Цикл for (1) вызывает `printNum(Number n)`, потому что тип массива `Number`. В вызовах (2): 

1. `new Integer(1)` и `11` вызывают `printNum(int i)`.
2. `1.11f` вызывает `printNum(Float f)`.
3. `11.11` вызывает `printNum(Number n)` из-за отсутствия метода для `double`.
*/