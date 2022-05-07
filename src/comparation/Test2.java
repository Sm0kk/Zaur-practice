package comparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee m1 = new Employee(100,"Zaur","Tregulov", 12345);
        Employee m2 = new Employee(15,"Ivan","Petrov", 6542);
        Employee m3 = new Employee(123,"Ivan","Sidorov", 8542);
      //  Arrays.sort(new Employee [] {m1,m2,m3});
        list.add(m1);
        list.add(m2);
        list.add(m3);
        List <Employee> test = Stream.of(m1,m2,m3).collect(Collectors.toList());

        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new salaryComparator());
        System.out.println("After sorting \n" + list);
    }
}


class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
        // return this.id  - anotherEmp.id;
        //  return this.name.compareTo(anotherEmp.name);
    /*int res = this.name.compareTo(anotherEmp.name);
    if (res == 0) {
        res = this.surname.compareTo(anotherEmp.surname);
    }
    return res;
    }*/
    }
}
/*class idComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}*/

class nameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary-emp2.salary;
    }
}

