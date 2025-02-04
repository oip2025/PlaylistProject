public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...");
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...");
        p.addSong("This Must Be the Place", "Talking Heads", "4:56", false);
        System.out.println("Added \"This Must Be the Place\" by Talking Heads (4:56)");
        p.addSong("Dominoes", "Donald Byrd", "4:33", false);
        System.out.println("Added \"Dominoes\" by Donald Byrd (4:33)");
        p.addSong("Check the Rhime", "A Tribe Called Quest", "3:36", false);
        System.out.println("Added \"Check the Rhime\" by A Tribe Called Quest (3:36)");
        p.addSong("Con Altura", "Rosalia", "2:41", false);
        System.out.println("Added \"Con Altura\" by Rosalia (2:41)");
        p.addSong("California", "Joni Mitchell", "3:50", false);
        System.out.println("Added \"California\" by Joni Mitchell (3:50)");

        System.out.println("Printing the songs...");
        for (int i = 0; i < p.vibes.size(); i++)
        {

        }

        System.out.println("Liking the songs in position 1, 3 and 4...");
        p.like(p.vibes.get(1).getName());
        p.like(p.vibes.get(3).getName());
        p.like(p.vibes.get(4).getName());

        System.out.println("Printing the songs...");
        for (Song song : p.vibes) {  
            System.out.println(song.getName() + " - " + 
                song.getArtist() + " - " + 
                song.songDuration() );

        }

        System.out.println("Removing the song in position 2...");
        p.removeSong(p.vibes.get(2).getName());

        System.out.println("Printing the songs...");

        for (Song vibe : p.vibes) {
            String likedStatus = "";
            if (vibe.isLiked()) {
                likedStatus = " liked";
            }

            System.out.println(vibe.getName() + ", " 
                + vibe.getArtist() + ", " 
                + vibe.songDuration() + likedStatus);
        }
        System.out.println("Printing only the liked songs...");
        for (int i = 0; i < p.vibes.size(); i++) {
            Song vibe = p.vibes.get(i);
            if (vibe.isLiked()) {
                System.out.println(vibe.getName() + ", " 
                    + vibe.getArtist() + ", " 
                    + vibe.songDuration() + " liked");
            }
        }
        System.out.println("Printing the total duration of all songs...");
        System.out.println(p.totalDuration());

        System.out.println("Removing all unliked songs at once...");
        p.removeUnliked();

        System.out.println("Printing all songs...");
        for (int i = 0; i < p.vibes.size(); i++)
        {
            Song vibe = p.vibes.get(i);
            System.out.println(vibe.getName() + ", " 
                    + vibe.getArtist() + ", " 
                    + vibe.songDuration());
        }
    }
}
