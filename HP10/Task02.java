import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // Создание и вывод массива
        int[] arr = {4, 2, 8, 6, 3};
        
        // Метод toString() для преобразования массива в строку
        System.out.println("Массив в строковом представлении: " + Arrays.toString(arr));

        // Метод sort() для сортировки массива
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        // Метод binarySearch() для поиска элемента в отсортированном массиве
        int index = Arrays.binarySearch(arr, 6);
        System.out.println("Индекс элемента 6: " + index);

        // Метод equals() для проверки равенства массивов
        int[] arr2 = {2, 3, 4, 6, 8};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Массивы равны: " + isEqual);

        // Пример метода compare() - сравнение двух массивов
        int comparison = Arrays.compare(arr, arr2);
        System.out.println("Результат сравнения массивов: " + comparison);
    }
}
