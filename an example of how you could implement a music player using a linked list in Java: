import java.util.LinkedList;

public class MusicPlayer {
    private LinkedList<String> playlist;

    public MusicPlayer() {
        playlist = new LinkedList<>();
    }

    // method to add a song to the playlist
    public void addSong(String song) {
        playlist.add(song);
    }

    // method to remove a song from the playlist
    public void removeSong(String song) {
        playlist.remove(song);
    }

    // method to shuffle the playlist
    public void shuffle() {
        // implement shuffling algorithm here
    }

    // method to play the next song in the playlist
    public String playNext() {
        if (playlist.isEmpty()) {
            throw new IllegalStateException("Cannot play from an empty playlist");
        }
        return playlist.removeFirst();
    }
}
