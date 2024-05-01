package salary;

class Employee {
    protected String name;
    protected double salary = 500;
    protected int year;

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void calculateSalary() {
        double lastSalary = year * salary;
        System.out.println("Employee: " + name + ", Years worked: " + year + ", Last salary:" + lastSalary);
    }
}
