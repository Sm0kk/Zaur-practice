package nested_classes.inner_class;

public class Car {
    String color;
    int dorCount;
    Engine engine;

    public Car(String color, int dorCount) {
        this.color = color;
        this.dorCount = dorCount;
 //       this.engine = this.new Engine(horsePower);
    }

    public void setEngine (Engine engine) {
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

    public  class Engine {
        int horsePower;

        public Engine(int horsePower) {
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
      //  Car car = new Car("black", 4,300);
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);

        System.out.println(engine);
        System.out.println(car);

    }
}
