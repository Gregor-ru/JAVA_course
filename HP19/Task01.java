public enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    
    private final int dayNumber; // Номер дня в неделе

    // Конструктор перечисления
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Метод для получения номера дня
    public int getDayNumber() {
        return dayNumber;
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println("День: " + day + ", Номер дня: " + day.getDayNumber());
        
        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            default:
                System.out.println("Обычный день.");
        }
    }
}
