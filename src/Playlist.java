import com.amazonaws.services.dynamodbv2.xspec.S;

import java.util.LinkedList;

public class Playlist {

    LinkedList<Song> songs;
    /**
     * Constructor.
     */
    public Playlist() {

    }

    /**
     * Provides the next song to be played from this playlist.
     * Once a song is played it will not be available to be played again.
     * @return The next Song in the playlist, or null if the playlist is empty.
     */
    public Song getNextSong() {
        if(songs == null || songs.isEmpty()) {
            return null;
        }
        return songs.remove();
    }

    /**
     * Adds a Song to the end of the playlist.
     * @param song the song to be added to the playlist.
     */
    public void addSong(Song song) {
        if (songs == null) {
            songs = new LinkedList<>();
        }
        songs.add(song);
    }

}
