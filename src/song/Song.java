package song;

public class Song {

    String title;
    String artist;
    int year;
    String album;

    public Song (String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title = '" + title + '\'' +
                ", artist = '" + artist + '\'' +
                ", year = " + year +
                ", album = '" + album + '\'' +
                '}';
    }
}
