package Assignment;

public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    enum genre {
        pop,
        rock,
        hiphop,
        rnb,
        jazz,
        instrumental,
        undified
    }
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(int genre) {
        this.genre = genre.pop;
        this.genre = genre.rock;
        this.genre = genre.hiphop;
        this.genre = genre.rnb;
    }

    public void printInfo(int detailLevel) {
        System.out.println("song title: " + title);
        System.out.println("release year: " + releaseYear);
        if (genre == 0) {
            System.out.println("genre: " + genre.undified);
        }

        if (detailLevel > 0) {
            if (artist != null) {
                System.out.println("artist name: " + artist.getName());
                System.out.println("artist also known as: " + artist.getAlias());
            }

            if (detailLevel > 1) {
                if (album != null) {
                    System.out.println("album title: " + album.getName());
                }
            }
        }
    }
}