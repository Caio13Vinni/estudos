package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
    Car sandero = new Car();
    Car fusca = new Car();

    sandero.Model = "Sport";
    sandero.name = "Sandero";
    sandero.year = 2014;

    fusca.year = 2014;
    fusca.name = "fusca";
    fusca.Model = "Split Window";

        System.out.println(sandero.year);
        System.out.println(sandero.name);
        System.out.println(sandero.Model);

        System.out.println(fusca.year);
        System.out.println(fusca.name);
        System.out.println(fusca.Model);

    }
}
