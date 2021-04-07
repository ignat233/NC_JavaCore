package JavaHW1.OOP.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee(1,"Jim","Jons",5242);
        System.out.println(employee);
        System.out.println("Salary:" + employee.getSalary());
        System.out.println("Year salary:" + employee.getAnnualSalary());
        System.out.println("Raice salary on 15%:" + employee.raiseSalary(15));
        System.out.println("Year salary:" + employee.getAnnualSalary());
    }

}
