class Animal {
    // Метод, который будет переопределен
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода sound в классе Dog
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Вызовет метод из класса Animal

        Dog dog = new Dog();
        dog.sound();  // Вызовет переопределенный метод из класса Dog
    }
}
