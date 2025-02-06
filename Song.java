/**
 * File for a Song class to be used in the Playlist Project
 * @author Emma and Olivia
 * @version 2-6-2025
 */
public class Song {
    private String name;
    private String duration;
    private boolean liked;
    private String artist;

    /**
     * Constructor
     */
    public Song(String name, String artist, String duration, boolean liked)
    {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.liked = liked;
    }

    /**
     * the method getName() returns the name of the song
     */    
    public String getName()
    {
        return name;  
    }
    /**
     * the method getArtist() returns the artist name of the song
     */
    public String getArtist()
    {
        return artist;
    }
    /**
     * the method getDuration() returns the duration of the song
     */
    public String getDuration()
    {
        return duration;
    }
    /**
     * the method getLiked determines if a song is liked or not
     */
    public boolean isLiked()
    {
        return liked;
    }
    public void like()
    {
        liked = true;
    }

    public void unlike()
    {
        liked = false;
    }
    /**
     * the method calcDuration() determines the duration of the song
     */
    public int calcDuration() //minutes and seconds as substrings
    {
        int colonPosition = 0;
        for (int i = 0; i < duration.length(); i++)
        {
            if (duration.substring(i, i + 1).equals(":")) //finding the colon
            {
                colonPosition = i;
                break; // breaking out of the loop
            }
        }
        String minutesPart = duration.substring(0, colonPosition);
        String secondsPart = duration.substring(colonPosition + 1); // one after that index to the end
        
        int minutes = Integer.parseInt(minutesPart); //converting it to this
        int seconds = Integer.parseInt(secondsPart);
        
        return (minutes * 60) + seconds;
    }
    public String toString() // a toString method now will make it easier later with objects // liked or not too with if else
    {
        String phrase = "\"" + name + "\" by " + artist + " (" + duration + ")"; // using the backslash to exit the thing to have quotations in it
        if (liked == true) // adding liked only if liked
        {
            phrase += " -- liked"; 
        }
        return phrase;
    }
}
