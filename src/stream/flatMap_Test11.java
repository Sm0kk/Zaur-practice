package stream;

import java.util.ArrayList;
import java.util.List;

public class flatMap_Test11 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28,2,6.4);
        Student1 st3 = new Student1("Elena", 'f', 19,1,8.9);
        Student1 st4 = new Student1("Petr", 'm', 35,4,7);
        Student1 st5 = new Student1("Maria", 'f', 23,3,7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List <Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudent1List().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}

class Faculty{
    String name;
    List<Student1> student1List;

    public Faculty(String name) {
        this.name = name;
        student1List = new ArrayList<>();
    }

    public List<Student1> getStudent1List() {
        return student1List;
    }

    public void addStudentToFaculty (Student1 student) {
        student1List.add(student);
    }
}