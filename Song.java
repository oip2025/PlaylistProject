/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    private String songName;
    private String songDur;
    private boolean liked;
    private String artist;

    public Song(String songName, String artist, String songDur, boolean liked)
    {
        this.songName = songName;
        this.songDur = songDur;
        this.liked = false;
        this.artist = artist;
    }
    public String getName()
    {
          return songName;  
    }
    public String getArtist()
    {
        return artist;
    }
    public String songDur()
    {
        return songDur;
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
        String min = songDur.substring(0, songDur.indexOf(":"));
        sec += Integer.parseInt(min) * 60;
        String secPart = songDur.substring(songDur.indexOf(":") + 1, songDur.length());
        sec += Integer.parseInt(secPart);
        return sec;
    }
}
