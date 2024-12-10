class Animal {
}

class Dog extends Animal {
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        Animal nullAnimal = null;

        // Применение instanceof к объектам
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));       // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));       // true

        // Применение instanceof к null
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false
    }
}
