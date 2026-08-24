package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Employee {

    public String name;
    public int age;
    public double[] salaries = {2300, 3200, 5000};


    public void print(Employee print){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salaries);

    }

    public void avaregeSalaries(){
       double avaregeSalaries = salaries[0] + salaries[1] + salaries[2] / 3;

        System.out.println(avaregeSalaries);

    }
}
