package academy.devdojo.maratonajava.javacore.CmethodOverLoading.Domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;

    }

    public void init(String name, String type, int episodes, String status){
        this.init(name, type, episodes);
        this.status = status;
    }



    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.status);
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }


    public String getName() {
        return name;
    }

    public void getEpisodes(int episodes){
        this.episodes = episodes;
    }

    public void getType(String type){
        this.type = type;
    }

    public void getStatus(String status){
        this.status = status;
    }
}
