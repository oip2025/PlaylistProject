public class PlaylistTester {
    public static void main(String[] args)
    {
        System.out.println("Initializing a Playlist...");
        Playlist myPlaylist = new Playlist();
        System.out.println();

        // adding songs
        System.out.println("Adding songs to the Playlist...");
        myPlaylist.addSong("Astronomy", "Conan Gray", "3:39", false);
        myPlaylist.addSong("Cruel Summer", "Taylor Swift", "2:58", false);
        myPlaylist.addSong("traitor", "Olivia Rodrigo", "3:49", false);
        myPlaylist.addSong("happier than ever", "Billie Eilish", "5:15", false);
        myPlaylist.addSong("no tears left to cry", "Ariana Grande", "3:25", false);
        System.out.println();

        // printing all the songs
        System.out.println(myPlaylist.printAllSongs());

        // liking songs
        System.out.println("Liking the songs: 'Cruel Summer', 'happier than ever', and 'no tears left to cry'...");
        myPlaylist.likeSong("Cruel Summer");
        myPlaylist.likeSong("happier than ever");
        myPlaylist.likeSong("no tears left to cry");
        System.out.println();

        // printing new list of liked songs
        System.out.println(myPlaylist.printAllSongs());

        // removing song by name
        System.out.println("Removing the song 'traitor'...");
        myPlaylist.removeSong("traitor");
        System.out.println();

        // print new list
        System.out.println(myPlaylist.printAllSongs());

        // print liked songs list
        System.out.println(myPlaylist.printLikedSongs());

        // print total duratoin
        System.out.println(myPlaylist.totalDuration());

        // removing unliked songs
        System.out.println("Removing all unliked songs...");
        myPlaylist.removeUnlikedSongs();
        System.out.println();

        // printing final list
        System.out.println(myPlaylist.printAllSongs());
    }
}