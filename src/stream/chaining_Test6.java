package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class chaining_Test6 {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
        int result = Arrays.stream(array).filter(e -> e%2 == 1)
                .map(e -> {if (e % 3 ==0) {e = e / 3;} return e;})
                .reduce((a,e) -> a + e).getAsInt();
        System.out.println(result);


        Student1 st1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28,2,6.4);
        Student1 st3 = new Student1("Elena", 'f', 19,1,8.9);
        Student1 st4 = new Student1("Petr", 'm', 35,4,7);
        Student1 st5 = new Student1("Maria", 'f', 23,3,7.4);
        List<Student1> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        studentList.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e -> e.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);


        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(e -> {
            System.out.println("!!!");
            return e % 2 == 0;
        }); // не будет работать, так как нет терминального метода.
    }



}
