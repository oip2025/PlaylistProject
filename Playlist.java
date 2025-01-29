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
    ArrayList<Song> vibes;
     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        vibes = new ArrayList<Song>();
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
    public void addSong(String name, String artist, String duration, boolean liked)
    {
        Song newSong = new Song(name, artist, duration, liked);
        vibes.add(newSong);
    }
    public void like(String name)
    {
        for(int i = 0; i < vibes.size(); i++)
        {
            if(vibes.get(i).isLiked() == false &&
               vibes.get(i).getName().equals(name)) // aka if the song that it's on is not already liked and also matches that title
            {
                vibes.get(i).like(); // using like method fron with Song class (object)
            }
        }
    }
    public void removeSong(String name) //saying which song want to remove
    {
        for (int i = vibes.size() - 1; i >= 0; i--)
        {
            if (vibes.get(i).getName().equals(name)) // so if corresponds to the name of the song that said trying to remove
            {
                vibes.remove(i);
            }
        }
    }
    public String allSongs()
    {
        String all = "";
        for(int i = 0; i < vibes.size(); i++)
        {
            all += vibes.get(i).getName() + ", "; // adding a comma for the list
        }
        return all;
    }
    public ArrayList<Song> likedSongs() // making new list of new songs
    {
        ArrayList<Song> best = new ArrayList<Song>();
        for(int i = 0; i < vibes.size(); i++) // going through old list
        {
            if(vibes.get(i).isLiked())
            {
                best.add(vibes.get(i)); // adding one by one to the new list of it's liked
            }
        }
        return best;
    }
    public double totalDuration()
    {
        double total = 0;
        for(int i = 0; i < vibes.size(); i++)
        {
            total += vibes.get(i).calcDuration(); // using calcDuration method of total duration of a song (method in the Song class)
        }
        return total / 60; // also converting from seconds back to minutes
    }
    public void removeUnliked() // using ArrayList function method remove()
    {
        for (int i = vibes.size() - 1; i >= 0; i--) // going backwards instead
        {
            if(vibes.get(i).isLiked() == false) // boolean confirming that it's not already liked
            {
                vibes.remove(i);
            }
        }
    }
}
