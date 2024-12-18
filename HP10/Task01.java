public class ArrayAssignmentExample {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        
        // Присваиваем ссылку массива a2 в переменную a1
        a1 = a2;

        // Выводим элементы массива a1 после присваивания
        System.out.println("Массив a1 после присваивания:");
        for (int i : a1) {
            System.out.print(i + " ");
        }
        //После выполнения кода массив `a1` будет ссылаться на тот же массив, что и `a2`. 
        //Таким образом, `a1` и `a2` оба будут ссылаться на `{6,7,8,9,10}`. 
        //Первоначальное содержимое `a1` будет утеряно.
    }
}



