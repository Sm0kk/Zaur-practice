package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted_Test5 {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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

        studentList = studentList.stream().sorted((x,y) -> x.getName().compareTo(y.getName()) ).collect(Collectors.toList());
        System.out.println(studentList);

    }
}
