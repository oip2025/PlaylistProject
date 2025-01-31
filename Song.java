/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    private String name;
    private String songDuration;
    private boolean liked;
    private String artist;

    public Song(String Name, String artist, String songDuration, boolean liked) {
        this.name = Name;
        this.songDuration = songDuration;
        this.liked = liked;
        
        this.artist = artist;
    }
    

    public String getName()
    {
        return name;  
    }

    public String getArtist()
    {
        return artist;
    }

    public String songDuration()
    {
        return songDuration;
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

    public double calcDuration()
    {
        double sec = 0;
        int colonPosition = -1;
        for (int i = 0; i < songDuration.length(); i++) {
            if (songDuration.charAt(i) == ':') {
                colonPosition = i;
                break;
            }
        }
        String min = songDuration.substring(0, colonPosition);
        sec += Integer.parseInt(min) * 60;
        String secPart = songDuration.substring(colonPosition + 1);
        sec += Integer.parseInt(secPart);
        return sec;
    }

}
