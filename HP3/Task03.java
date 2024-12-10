public class VariableScope {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        // int c = a + b; // Ошибка компиляции: переменная b недоступна за пределами блока {}
    }
}
