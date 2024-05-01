package salary;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 5);
        Manager manager = new Manager("Mike", 1);
        Director director = new Director("Alice", 3);

        employee.calculateSalary();
        manager.calculateSalary();
        director.calculateSalary();
    }
}