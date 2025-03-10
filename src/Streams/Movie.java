package Streams;

public class Movie {

    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void invoke() {
        fn();
    }

    private void fn() {
        System.out.println("fn called");
    }

}
