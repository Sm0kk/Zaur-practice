package nested_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math2 m = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(32, 54));
        System.out.println(m2.doOperation(32, 54));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
