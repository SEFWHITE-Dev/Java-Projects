
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Song inputSong) {
        if (this == inputSong) {
            return true;
        } else if (this.artist.equals(inputSong.artist) &&
                this.name.equals(inputSong.name) &&
                this.durationInSeconds == inputSong.durationInSeconds) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
