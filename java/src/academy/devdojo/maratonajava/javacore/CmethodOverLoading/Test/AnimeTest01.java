package academy.devdojo.maratonajava.javacore.CmethodOverLoading.Test;

import academy.devdojo.maratonajava.javacore.CmethodOverLoading.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akuda Drive", "Tv " , 12, "Finishied");

        anime.print();
    }
}
