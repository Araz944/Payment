package salary;

class Manager extends Employee {
    protected static final double BASE_SALARY = 5000;
    protected static final double BONUS_FACTOR = 2.5;

    public Manager(String name, int year) {
        super(name, year);
    }

    @Override
    public void calculateSalary() {
        double lastSalary = BASE_SALARY + year * salary + BASE_SALARY * BONUS_FACTOR / 100;
        System.out.println("Manager: " + name + ", Years worked: " + year + ", Last salary:" + lastSalary);
    }
}