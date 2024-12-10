public enum Season {
    WINTER("Холодно и снежно"),
    SPRING("Тепло и цветет всё вокруг"),
    SUMMER("Жарко и солнечно"),
    AUTUMN("Прохладно и листья опадают");

    private final String description; // Описание сезона

    // Конструктор перечисления
    Season(String description) {
        this.description = description;
    }

    // Метод для получения описания сезона
    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        // Пример использования перечисления
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());
        }
    }
}
