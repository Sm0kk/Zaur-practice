package nested_classes.static_nested_class;

public class Car {
    String color;
    int dorCount;
    Engine engine;
    static int a;

    public Car(String color, int dorCount, Engine engine) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", dorCount=" + dorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);
        Car car = new Car("red",2,e);
        System.out.println(car);

    }
}
class Z extends Car.Engine {
    Z() {
        super(200);
    }
}