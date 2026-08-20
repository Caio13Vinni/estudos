package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(20 + 20 + 20 + 7);
    }

    public void subtractTwoNumbers() {
        System.out.println(109 - 42 );
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumers(double num1, double num2){
       if (num2 == 0){
           return 0;
       }

        Double divisor = (num1 / num2);
        System.out.println(divisor);
       return divisor;
    }
}
