package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter print = new StudentPrinter();

        student01.name = "Midorya";
        student01.gender = 'M';
        student01.age = 67;

        student02.name = "Sakura";
        student02.gender = 'F';
        student02.age = 67;


        print.print(student01);

        System.out.println("-------------------");

        print.print(student02);
    }
}
