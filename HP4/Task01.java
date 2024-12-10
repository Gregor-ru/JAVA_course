/**
 * Класс демонстрирует использование комментариев для генерации документации.
 * Содержит примеры работы с методами и генерацией исключений.
 * 
 * @author Автор
 * @version 1.0
 * @since 2024
 */
public class DocumentationExample {

    private String name;

    /**
     * Конструктор класса.
     *
     * @param name Имя объекта
     */
    public DocumentationExample(String name) {
        this.name = name;
    }

    /**
     * Метод для получения имени объекта.
     *
     * @return Имя объекта
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает новое имя для объекта.
     *
     * @param name Новое имя
     * @throws IllegalArgumentException Если передано пустое имя
     */
    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    /**
     * Метод для демонстрации приветствия.
     *
     * @param greeting Приветствие
     * @return Строка с приветствием
     */
    public String greet(String greeting) {
        return greeting + ", " + name + "!";
    }

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        DocumentationExample example = new DocumentationExample("Егор");
        System.out.println(example.greet("Привет"));
    }
}
