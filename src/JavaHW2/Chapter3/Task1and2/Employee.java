package JavaHW2.Chapter3.Task1and2;

public class Employee implements IMeasurable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        double averageSalaryRus = 51081.0;
        System.out.print("Отношение зарплаты работника к средней зарплате в России:");
        return salary / averageSalaryRus;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }


}



