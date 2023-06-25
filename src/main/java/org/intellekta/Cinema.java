package org.intellekta;

public class Cinema {
    private String name;
    private String genre;
    private int duration;

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Cinema() {
    }

    public Cinema(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
