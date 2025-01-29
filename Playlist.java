import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
import java.util.ArrayList;
public class Playlist
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    ArrayList<String> Song = new ArrayList<String>();
    private String title;
    private String artist;
    private int durationInSeconds;
    private boolean liked;
     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(String title, String artist, int durationInSeconds)
    {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getDuration()
    {
        return durationInSeconds;
    }
    public boolean isLiked()
    {
        return liked;
    }
    public String add(String title, String author, int durationInSeconds)
    {
        return "Adding " + title + " by " + author + "(" + durationInSeconds + ")";
    }
    public int totalDuration()
    {
        
    }
    public String removeUnliked()
    {
        while(liked == false)
        {
            Song.remove(title);
        }
    }
}
