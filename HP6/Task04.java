public class IntegerCacheExample {
  public static void main(String[] args) {
      int i1 = 128;
      Integer a1 = i1; // Автоупаковка (boxing), создается новый объект Integer
      Integer b1 = i1; // Автоупаковка (boxing), создается еще один новый объект Integer

      // Сравнение объекта и примитива: выполняется автораспаковка (unboxing)
      System.out.println("a1==i1 " + (a1 == i1)); // true
      System.out.println("b1==i1 " + (b1 == i1)); // true

      // Сравнение объектов: разные объекты, т.к. 128 не входит в диапазон IntegerCache
      System.out.println("a1==b1 " + (a1 == b1)); // false

      // equals сравнивает значения, а не ссылки, поэтому результат будет true
      System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
      System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
      System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

      int i2 = 127;
      Integer a2 = i2; // Автоупаковка, объект берется из кэша IntegerCache
      Integer b2 = i2; // Автоупаковка, объект берется из того же кэша

      // Сравнение объекта и примитива: автораспаковка, значения равны
      System.out.println("a2==i2 " + (a2 == i2)); // true
      System.out.println("b2==i2 " + (b2 == i2)); // true

      // Сравнение объектов: ссылки одинаковы, т.к. используется IntegerCache
      System.out.println("a2==b2 " + (a2 == b2)); // true

      // equals проверяет значения, поэтому результат всегда true
      System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
      System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
      System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true
  }
}
