package JavaHW2.Chapter3.Task1and2;

public class TestChapter3 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob",75452.0);
        Employee employee2 = new Employee("Viktor",56342.24);
        Employee employee3 = new Employee("Jim",148231.43);
        Employee employee4 = new Employee("Ivan",102985.43);
        Employee[] employees = new Employee []{employee1,employee2,employee3,employee4};

        System.out.println(average(employees));

        System.out.println(((Employee)largest(employees)).getName());


    }
    static double average(IMeasurable[] emp){
        double salary = 0;
        for(int i =0; i < emp.length;i++) salary +=  ((Employee)emp[i]).getSalary();
        return salary/emp.length;
    }

    static IMeasurable largest(IMeasurable[] emplo) {
        double maxSalary = 0;
        int n = 0;
        for(int i =0; i < emplo.length;i++) {
            if (maxSalary < ((Employee)emplo[i]).getSalary()) {
                maxSalary = ((Employee)emplo[i]).getSalary();
                n = i;
            }
        }
        return emplo[n];
    }
}
