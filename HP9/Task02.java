public class BreakContinueExample {
    public static void main(String[] args) {
        // Пример с break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Прерывание цикла, когда i = 5
            }
            System.out.println("Цикл с break: " + i);
        }

        // Пример с continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Пропуск итерации, когда i = 5
            }
            System.out.println("Цикл с continue: " + i);
        }
    }
}
