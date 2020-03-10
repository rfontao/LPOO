import java.util.ArrayList;
import java.util.List;

public class Band extends Act {

    List<Artist> artists;

    public Band(String name, String country){
        super(name,country);
        this.artists = new ArrayList<>();
    }

    public void addArtist(Artist artist){
        artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public boolean containsArtist(Artist a){
        for(Artist artist : artists){
            if(artist.equals(a)){
                return true;
            }
        }
        return false;
    }
}
