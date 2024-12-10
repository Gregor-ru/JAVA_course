class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(42);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");

        // Проверка типа с помощью instanceof
        if (intWrapper instanceof Wrapper<?>) {
            System.out.println("intWrapper is an instance of Wrapper");
        }

        if (stringWrapper instanceof Wrapper<?>) {
            System.out.println("stringWrapper is an instance of Wrapper");
        }
    }
}
