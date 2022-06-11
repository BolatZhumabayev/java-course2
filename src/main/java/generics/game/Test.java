package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 14);
        Schoolar schoolar3 = new Schoolar("Petr", 12);
        Schoolar schoolar4 = new Schoolar("Oksana", 11);

        Student student1 = new Student("Kolya", 20);
        Student student2 = new Student("Kseniya", 21);
        Student student3 = new Student("Michail", 22);
        Student student4 = new Student("Olzhas", 24);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Tanya", 27);
        Employee employee3 = new Employee("Miras", 34);
        Employee employee4 = new Employee("Zoya", 29);

        Team<Schoolar> scholarTeam = new Team<>("Dragons");
        scholarTeam.addParticipant(schoolar1);
        scholarTeam.addParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Forever");
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Light");
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        Team<Schoolar> scholarTeam2 = new Team<>("Wizards");
        scholarTeam2.addParticipant(schoolar3);
        scholarTeam2.addParticipant(schoolar4);

        Team<Student> studentTeam2 = new Team<>("Alga");
        studentTeam2.addParticipant(student3);
        studentTeam2.addParticipant(student4);

        Team<Employee> employeeTeam2 = new Team<>("Storm");
        employeeTeam2.addParticipant(employee3);
        employeeTeam2.addParticipant(employee4);

        scholarTeam.playWith(scholarTeam2);

//        team.addParticipant(student1);
//        team.addParticipant(employee1);

    }
}
