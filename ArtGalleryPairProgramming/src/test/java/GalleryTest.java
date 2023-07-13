import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Creative");
        Artwork picassoArt = new Artwork("Scream","Picasso",5000.0);
        gallery.addArtwork(picassoArt);
    }
    @Test
    public void getGalleryName(){
        assertThat(gallery.getName()).isEqualTo("Creative");
    }

    @Test
    public void getTillBalance(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void getArtworkStock(){
        assertThat(gallery.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void canAddArtwork(){
        Artwork leonardoArt = new Artwork("MonaLisa","Leonardo",7000.0);
        gallery.addArtwork(leonardoArt);
        assertThat(gallery.getArtworkCount()).isEqualTo(2);
    }

    @Test
    public void canSetTillBalance(){
        gallery.setTill(5000.0);
        assertThat(gallery.getTill()).isEqualTo(5000.0);
    }


}
