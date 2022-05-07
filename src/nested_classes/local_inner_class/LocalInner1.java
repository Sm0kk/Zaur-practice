package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{

    public void getResult() {
        class Devide{
            private int x;
            private int y;

            public void setX(int x) {
                this.x = x;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
            public int getResult() {
                return x/y;
            }
            public int getReminder() {
                return x%y;
            }
        }
        Devide devide = new Devide();
        devide.setX(21);
        devide.setY(4);
        System.out.println("Result: " + devide.getResult());
        System.out.println("Reminder: " + devide.getReminder());
    }
}
