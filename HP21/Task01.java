class Parent {
    // Метод объявлен как final, его нельзя переопределить в подклассе
    public final void show() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    // Ошибка: нельзя переопределить final-метод
    @Override
    public void show() {
        System.out.println("Метод подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show(); // Вызовет метод из суперкласса
    }
}
