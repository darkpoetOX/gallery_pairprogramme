import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> artworks; //empty

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double updatedTill){
        this.till = updatedTill;
    }

    public int getArtworkCount(){
        return this.artworks.size();
    }

    public void addArtwork(Artwork newArtwork){
        this.artworks.add(newArtwork);
    }

}
