package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        /*
                person.name = "jiraya";
                person.age = 70;
        */

        person.setName("jiraya");
        person.setAge(-123);

        person.print();

    }
}
