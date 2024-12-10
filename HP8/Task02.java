public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1; // Это выполняется, если value == 1
                break;
            case 2:
                i = 2; // Это выполняется, если value == 2
                // Переход на следующий case без break
            case 3:
                i = 3; // Это также выполняется, если value == 2 (падает сюда)
                break;
            default:
                i = 4; // Это выполняется, если value не соответствует case 1, 2 или 3
        }

        System.out.println("Значение i: " + i);
    }
}
