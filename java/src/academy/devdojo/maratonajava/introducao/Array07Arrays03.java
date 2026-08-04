package academy.devdojo.maratonajava.introducao;

public class Array07Arrays03 {
    public static void main(String[] args) {
     int[] numbers = new int[3];
     int[] numbers2 = {1,2,3,4,5};
     int[] numbers3 = new int[]{5,4,3,2,1};


     for(int i = 0; i < numbers2.length; i++){
         System.out.print(numbers2[i]);

     }

        System.out.println(" ");

     for(int num: numbers3){
         System.out.print(num);
     }
    }
}