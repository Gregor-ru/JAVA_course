// Пример перегрузки и переопределения методов

// Суперкласс (родительский класс)
class Animal {
    // Переопределяемый метод
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Метод для перегрузки
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Перегруженный метод (с разными параметрами)
    public void sleep(int hours) {
        System.out.println("Animal is sleeping for " + hours + " hours");
    }

    // Перегруженный метод с разными параметрами
    public void sleep(int hours, String place) {
        System.out.println("Animal is sleeping for " + hours + " hours at " + place);
    }
}

// Подкласс (дочерний класс)
class Dog extends Animal {
    // Переопределение метода суперкласса
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Дополнительный метод в классе Dog
    public void fetchBall() {
        System.out.println("Dog is fetching the ball");
    }
}

public class MethodOverloadingAndOverridingExample {
    public static void main(String[] args) {
        // Пример переопределения метода
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Вызывается метод из Animal

        Dog myDog = new Dog();
        myDog.makeSound(); // Вызывается переопределенный метод из Dog
        myDog.fetchBall(); // Метод Dog, которого нет в Animal

        // Пример перегрузки методов
        myAnimal.sleep();  // Вызывается метод без параметров
        myAnimal.sleep(5);  // Вызывается метод с одним параметром
        myAnimal.sleep(5, "yard");  // Вызывается метод с двумя параметрами
    }
}
