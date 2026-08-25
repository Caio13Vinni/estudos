package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.EmployeePrint;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeePrint print = new EmployeePrint();

        employee.name = "Carlos";
        employee.age = 17;
        employee.salaries[1] = 2334;

        print.print(employee);
    }
}
