package stream;

import java.util.ArrayList;
import java.util.List;

public class min_max_Test14 {
    public static void main(String[] args) {
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

        Student1 min = studentList.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        Student1 max = studentList.stream().max((x,y) -> x.getAge() - y.getAge()).get();

       // System.out.println(min + "\n" + max);

        studentList.stream().filter(el -> el.getAge() > 20).limit(2).forEach(System.out::println);
        studentList.stream().filter(el -> el.getAge() > 20).skip(2).forEach(System.out::println);


    }
}
