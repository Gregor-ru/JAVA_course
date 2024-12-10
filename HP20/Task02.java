class A {
    int a1; // по умолчанию (package-private)
    public int a2; // доступен всем
    protected int a3; // доступен в том же пакете и подклассам
    private int a4; // доступен только внутри класса A

    void method1() { ... }
    public void method2() { ... }
    protected void method3() { ... }
    private void method4() { ... }
}

class B extends A {
    void test() {
        // Доступность членов класса A в классе B:
        System.out.println(a1); // доступно (package-private, в том же пакете)
        System.out.println(a2); // доступно (public)
        System.out.println(a3); // доступно (protected)
        // System.out.println(a4); // НЕ доступно, так как a4 private
    }
}

class C extends B {
    void test() {
        // Доступность членов класса A в классе C:
        System.out.println(a1); // доступно (package-private, в том же пакете)
        System.out.println(a2); // доступно (public)
        System.out.println(a3); // доступно (protected)
        // System.out.println(a4); // НЕ доступно, так как a4 private
    }
}
