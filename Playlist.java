/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author Emma and Olivia
 * @version 2-6-2025
 */
import java.util.ArrayList;
public class Playlist
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> vibes;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        vibes = new ArrayList<>();
    }
      /**
       * method addSong() adds song to playlist
       * @param name name of song
       * @param artist name of artist
       * @param duration song length
       * @param liked liked status
       */
    public void addSong(String name, String artist, String duration, boolean liked)
    {
        Song newSong = new Song(name, artist, duration, liked);
        vibes.add(newSong);
        System.out.println("Added " + newSong);
    }
    /**
     * likeSong() likes a song
     * @param name song name
    */
    public void likeSong(String name)
    {
        for(Song song : vibes)
        {
            if (song.getName().equalsIgnoreCase(name)) // finding song by looking through the whole list
            {
                song.like(); // don't have to do vibes.get(i).like() here bc of enhanced for loop
            }
        }
    }
    /**
     * removeSong() removes song from playlist
     * @param name name of song
     */
    public void removeSong(String name) //saying which song want to remove
    {
        for (int i = vibes.size() - 1; i >= 0; i--)
        {
            if (vibes.get(i).getName().equalsIgnoreCase(name)) // so if corresponds to the name of the song that said trying to remove
            {
                System.out.println("Removing: " + vibes.get(i));
                vibes.remove(i);
                //doing it for all in the thing I guess
            }
        }
    }
    /**
     * prints songs
     */
    public String printAllSongs()
    {
        String allSongs = "Printing the songs...\n"; // n thing to like get out of it
        for (Song song : vibes) // enhanced for loop (can get value of whatever index straight without.get(i) stuff
        {
            allSongs += song + "\n"; // need this for formatting...idk I figured that out at some point
        }
        return allSongs;
    }
    /**
     * prints liked songs
     */
    public String printLikedSongs() // making new list of new songs
    {
        System.out.println("Printing only the liked songs...");
        ArrayList<Song> likedList = new ArrayList<Song>();
        for(Song song : vibes) // going through old list
        {
            if(song.isLiked())
            {
                likedList.add(song); // adding one by one to the new list of it's liked
            }
        }
        String output = "Printing only the liked songs...\n"; // using \n for like problem thing
        for(Song song : likedList)
        {
            output += song + "\n"; // print thing
        }
        return output;
    }
    /**
     * total song duration
     */
    public String totalDuration()
    {
        int totalSeconds = 0;
        for (Song song : vibes)
        {
            totalSeconds += song.calcDuration(); // using calcDuration method from Song class
        }
        int minutes = totalSeconds / 60; // whole numbers that get
        int seconds = totalSeconds % 60; // the remainder that get
        String result = "Total duration: " + minutes + ":";
        // if seconds are in the single digits, have to add a 0 to the middle first
        if (seconds < 10)
        {
            result += "0" + seconds;
        }
        else
        {
            result += seconds;
        }
        return result; // encountered the printing mistake thing AGAIN
    }
    /**
     * removes unliked songs
     */
    public void removeUnlikedSongs() // using ArrayList function method remove()
    {
        System.out.println("Removing all unliked songs...");
        for (int i = vibes.size() - 1; i >= 0; i--) // going backwards instead
        {
            if(!vibes.get(i).isLiked()) // boolean confirming that it's not already liked (false bc saying not true)
            {
                vibes.remove(i);
            }
        }
    }
}
