package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(10, "Ivan", "Sidorov", 1234567);
        Employee emp2 = new Employee(40, "Ivan", "Stepanov", 4567);
        Employee emp3 = new Employee(30, "Petr", "Ivanov", 5678);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting " + list + "\n");
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting " + list + "\n");
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
        return this.id - anotherEmp.id;
    }
}

class NameComparator  implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator  implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}