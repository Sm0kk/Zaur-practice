package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapToInt_Test15 {
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

        List<Integer> courses = studentList.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = studentList.stream().mapToInt(el -> el.getCourse()).sum(); //sum

        double average = studentList.stream()                                //average
                .mapToDouble(el -> el.getAvgGrade())
                .average()
                .getAsDouble();

        int min = studentList.stream().mapToInt(el -> el.getCourse())//min
                .min()
                .getAsInt();

        int max = studentList.stream().mapToInt(el -> el.getCourse())//max
                .max()
                .getAsInt();

    }
}
