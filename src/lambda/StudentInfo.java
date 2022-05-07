package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> predicate) {
        for (Student s : al) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

    void printStudentsOverGrade (ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if(s.avgGrade > grade) {
                System.out.println(s);
            }
        }

    }

    void printStudentsUnderAge (ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }

    }

    void printStudentsMixCondition (ArrayList<Student> al,int age, double grade, char sex) {
        for (Student s : al) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22,3,8.3);
        Student st2 = new Student("Nikolay", 'm', 28,2,6.4);
        Student st3 = new Student("Elena", 'f', 19,1,8.9);
        Student st4 = new Student("Petr", 'm', 35,4,7);
        Student st5 = new Student("Maria", 'f', 23,3,9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

       /* Collections.sort(students, (p1,p2) -> p1.course - p2.course);
        System.out.println(students);*/

        //info.testStudents(students, new CheckOverGrade());
       // System.out.println("--------------------------");
       /* info.testStudents(students, new StudentChecks() { // одно и тоже
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });*/

       /* info.testStudents(students, (Student s) -> {return s.age < 30;}); // одно и тоже
        System.out.println("--------------------------");
        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
        info.testStudents(students, s -> s.avgGrade > 8);*/

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents(students, p1.negate()); // инвертирует предикат
       // info.testStudents(students, p1.and(p2)); // объединяет предикаты
       // info.testStudents(students, p1.or(p2)); // и первый и второй предикат


        /*StudentChecks sc = (Student p) -> {return  p.avgGrade > 8;};
        info.testStudents(students, sc);*/

        /*System.out.println("--------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });*/

       /* StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students, 8);
        System.out.println("--------------------------");
        info.printStudentsUnderAge(students, 30);
        System.out.println("--------------------------");
        info.printStudentsMixCondition(students, 20, 9.5, 'f');*/


//        Function<Student, Double> f = student -> student.avgGrade;
//        double res = avgOfSmth(students, stud -> stud.avgGrade);
//        System.out.println(res);


    }
    private static double avgOfSmth (ArrayList<Student> list, Function<Student, Double> f) {
        double result = 0;
        for(Student st : list) {
            result += f.apply(st);
        }
        result /= list.size();
        return result;
    }
}

/*interface StudentChecks{
    boolean check(Student s);
}*/

/*class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}*/