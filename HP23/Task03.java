class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Без аннотации @Override компилятор не даст ошибку, даже если мы ошибемся в названии метода
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }

    // Ошибка! Неверное название метода
    // @Override
    // public void soud() {  // Ошибка: нет метода с таким именем в родительском классе
    //    System.out.println("Собака лает");
    // }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Вызовет метод sound() из класса Dog
    }
}
