public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");

        System.out.println("Added \"%s\" by %s ( %s)".formatted("This Must Be the Place", "Talking Heads", "4:56)"));
        p.addSong("Dominoes", "Donald Byrd ", "4:33", true);
        p.addSong("Check the Rhime", "A Tribe Called Quest", "3:36", false);
        p.addSong("Con Altura", "Rosalia", "(2:41)", true);
        p.addSong("California", "Joni Mitchell", "3:50", false);
        p.addSong("In A Good Way", "Faye Webster", "3:42", false);

        System.out.println("Printing the songs...\n");

        for (int i = 0; i < p.vibes.size(); i++)
        {
            System.out.println("%s by %s (%s)".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()));
        }

        System.out.println("\nLiking the songs in position 1, 3, 4\n");
        p.like(p.vibes.get(0).getName());
        p.like(p.vibes.get(2).getName());
        p.like(p.vibes.get(3).getName());

        System.out.println("Printing the songs...\n");

        for (int i = 0; i < p.vibes.size(); i++)
        {
            if (p.vibes.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()) );
            }
            else 
            {

                System.out.println("%s by %s (%s)".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()));
            }
        }

        System.out.println("\nRemoving the song in position 1 and 3\n");

        p.removeSong(p.vibes.get(1).getName());
        p.removeSong(p.vibes.get(3).getName());

        System.out.println("Printing the songs...\n");

        for (int i = 0; i < p.vibes.size(); i++)
        {
            if (p.vibes.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()) );
            }
            else 
            {

                System.out.println("%s by %s (%s)".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()));
            }
        }
        System.out.println("\nPrinting only the liked songs...\n");

        for (int i = 0; i < p.vibes.size(); i++)
        {
            if (p.vibes.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.vibes.get(i).getName(), p.vibes.get(i).getArtist(), p.vibes.get(i).songDuration()) );
            }
        }
        System.out.println("\nPrinting the total duration of all songs...\n");

        int parts = (int) (p.totalDuration());
        System.out.println(parts+ ":"+ (int) ((p.totalDuration() - parts) * 60));

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        System.out.println("Printing all songs...\n");

    }
}