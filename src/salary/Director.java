package salary;

class Director extends Manager {
    private static final double DIRECTOR_BASE_SALARY = 10000;

    public Director(String name, int year) {
        super(name, year);
    }

    @Override
    public void calculateSalary() {
        double lastSalary =
                DIRECTOR_BASE_SALARY + year * salary + BASE_SALARY + DIRECTOR_BASE_SALARY * BONUS_FACTOR / 100;
        System.out.println("Director: " + name + ", Years worked: " + year + ", Last salary:" + lastSalary);
    }
}