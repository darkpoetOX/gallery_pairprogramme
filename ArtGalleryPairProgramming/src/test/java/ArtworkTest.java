import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork picassoArt;

    @BeforeEach
    public void setUp(){
        picassoArt = new Artwork("Scream","Picasso",5000.0);
    }

    @Test
    public void getArtworkTitle(){
        assertThat(picassoArt.getTitle()).isEqualTo("Scream");
    }

    @Test
    public void getArtworkArtist(){
        assertThat(picassoArt.getArtist()).isEqualTo("Picasso");
    }

    @Test
    public void getArtworkPrice(){
        assertThat(picassoArt.getPrice()).isEqualTo(5000.0);
    }

    @Test
    public void setArtworkPrice(){
        picassoArt.setPrice(9000.0);
        assertThat(picassoArt.getPrice()).isEqualTo(9000.0);
    }


}
