package generics.game;

public class Test {
    public static void main(String[] args) {
        SchoolBoy schoolBoy1 = new SchoolBoy("Ivan", 13);
        SchoolBoy schoolBoy2 = new SchoolBoy("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team <SchoolBoy> schoolTeam = new Team("Dragons");
        Team <Student> studentTeam = new Team<>("Fuckers");
        Team <Employee> employeeTeam = new Team<>("Rabs");

        schoolTeam.addNewParticipant(schoolBoy1);
        schoolTeam.addNewParticipant(schoolBoy2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team <SchoolBoy> schoolTeam2 = new Team("Eggs");
        SchoolBoy schoolBoy3 = new SchoolBoy("Sergay", 15);
        SchoolBoy schoolBoy4 = new SchoolBoy("Olga", 14);
        schoolTeam2.addNewParticipant(schoolBoy3);
        schoolTeam2.addNewParticipant(schoolBoy4);

        schoolTeam.playWith(schoolTeam2);


    }
}
