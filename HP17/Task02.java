class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<? extends Number> box1 = new Box<>(10);  // Integer, который является подтипом Number
        Box<? extends Number> box2 = new Box<>(3.14);  // Double, который является подтипом Number
        
        // Мы можем работать с методами, которые могут быть вызваны для всех типов, производных от Number
        Number number1 = box1.getItem();
        Number number2 = box2.getItem();

        Box<? super Integer> box3 = new Box<>(10);  // Box может быть типа Integer или суперклассов Integer
        Box<? super Integer> box4 = new Box<>(5);   // Например, Object
        
        // Мы можем добавлять Integer или его подтипы
        box3 = new Box<>(10);
        box4 = new Box<>(15);
    }

    }
}
