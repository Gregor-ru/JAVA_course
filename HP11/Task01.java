// Пакет, в котором находится этот класс
package accessmodifiers;

class AccessModifiersExample {

    // private - доступно только внутри этого класса
    private int privateVar = 1;

    // (по умолчанию) - доступно только в пределах этого пакета
    int defaultVar = 2;

    // protected - доступно в этом пакете и в подклассах
    protected int protectedVar = 3;

    // public - доступно всем классам
    public int publicVar = 4;

    // Пример метода с каждым спецификатором доступа
    private void privateMethod() {
        System.out.println("Это приватный метод");
    }

    void defaultMethod() {
        System.out.println("Это метод с дефолтным доступом");
    }

    protected void protectedMethod() {
        System.out.println("Это защищенный метод");
    }

    public void publicMethod() {
        System.out.println("Это публичный метод");
    }
}

public class TestAccessModifiers {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Доступ к переменным и методам с различными спецификаторами доступа
        // доступ к private-элементам невозможен

        // Это вызовет ошибку компиляции, так как privateVar и privateMethod() - private
        // System.out.println(example.privateVar); // ошибка

        // Доступ к элементам с дефолтным доступом (по умолчанию)
        System.out.println(example.defaultVar);  // доступно в пределах того же пакета

        // Доступ к protected-методам и переменным
        System.out.println(example.protectedVar);  // доступно в пределах того же пакета

        // Доступ к public-методам и переменным
        System.out.println(example.publicVar);  // доступно в любом пакете

        // Вызов методов с различными спецификаторами доступа
        example.publicMethod();  // доступен
        example.protectedMethod();  // доступен
        example.defaultMethod();  // доступен в том же пакете
        // example.privateMethod();  // ошибка: недоступен, так как метод private
    }
}
