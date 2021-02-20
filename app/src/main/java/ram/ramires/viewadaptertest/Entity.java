package ram.ramires.viewadaptertest;

public class Entity {
    private String name;
    private String image;
    public Entity(String name, String image){
        this.name=name;
        this.image=image;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setImage(String image){
        this.image=image;
    }
    public String getImage(){
        return image;
    }
}
