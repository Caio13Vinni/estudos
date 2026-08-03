package academy.devdojo.maratonajava.introducao;

public class Array07Arrays02 {
    public static void main(String[] args) {
        //byte, short, double, float, long, int = 0;
        //char '\u0000' ''
        //boolean false
        //String null

        String[] names = new String[3];
        names [0] = "goku";
        names [1] = "naruto";
        names [2] = "gon";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}