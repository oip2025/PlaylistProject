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

    public Song(String name, String artist, String duration, boolean liked)
    {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.liked = liked;
    }

    public String getName()
    {
        return name;  
    }

    public String getArtist()
    {
        return artist;
    }

    public String getDuration()
    {
        return duration;
    }

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
