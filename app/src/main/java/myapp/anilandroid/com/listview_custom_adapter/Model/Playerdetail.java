package myapp.anilandroid.com.listview_custom_adapter.Model;

public class Playerdetail {
    int IMAGES;
    String Names;
    String Description;

    public Playerdetail(int IMAGES, String names, String description) {
        this.IMAGES = IMAGES;
        this.Names = names;
        this.Description = description;
    }

    public Playerdetail() {

    }


    public int getIMAGES() {
        return IMAGES;
    }

    public void setIMAGES(int IMAGES) {
        this.IMAGES = IMAGES;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
