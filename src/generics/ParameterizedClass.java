package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
       /* Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
*/
    }


}

class Info <T extends Number & I1 & I2> {
     private T value;

     public Info(T value){
         this.value = value;
     }

     public String toString(){
         return "{[" + value + "]}";
     }

     public T getValue() {
         return value;
     }
}
interface I1{}
interface I2{}
/*
class Parent{
    public void abc (Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent{
    public void abc (Info<Integer> info) {
        Integer s = info.getValue();
    }
}
*/