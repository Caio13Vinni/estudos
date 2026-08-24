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
       if (num2 == 0){ return 0;}

        Double divisor = (num1 / num2);
        System.out.println(divisor);
       return divisor;
    }

    public void changeTwoNumbers(int num1, int num2){
        num1= 99;
        num2= 33;

        System.out.println("Inside Change Two Numbers");
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);

    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
