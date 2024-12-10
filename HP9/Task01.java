public class InfiniteLoops {
    public static void main(String[] args) {
        // Бесконечный цикл с условием (while)
        while (true) {
            System.out.println("Это бесконечный цикл while");
            break; // выход из цикла
        }

        // Бесконечный цикл с постусловием (do-while)
        do {
            System.out.println("Это бесконечный цикл do-while");
            break; // выход из цикла
        } while (true);
    }
}
