package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Person {
    private String name;
    private int age;

        public void print(){
            System.out.println(getName());
            System.out.println(getAge());
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            if (age < 0){
                System.out.println("Error invalid Age");
            return;
            }
            this.age = age;
        }

        public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
