package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect_Test12 {
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

        Map<Integer, List<Student1>> map = studentList.stream().map(el -> {el.setName(el.getName().toUpperCase());
        return el;})
                .collect(Collectors.groupingBy(el -> el.getCourse()));
        for(Map.Entry<Integer, List<Student1>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        Map<Boolean, List<Student1>> map2 =
                studentList.stream()
                        .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for(Map.Entry<Boolean, List<Student1>> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


    }
}
