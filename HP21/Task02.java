// Класс объявлен как final, его нельзя наследовать
final class Parent {
    public void show() {
        System.out.println("Метод класса Parent");
    }
}

class Child extends Parent {  // Ошибка: нельзя наследовать от final-класса
    public void display() {
        System.out.println("Метод класса Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show(); // Вызовет метод из класса Parent
    }
}
