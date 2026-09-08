package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01{
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "teste";
        student.age = 14;
        student.gender = 'm';
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student.name);

    }
}
