package com.company;

public class Collection {
    private String type;
    private String artist;
    private String title;
    private int publication;
    private int rating;

    public Collection(String type, String artist, String title, int publication, int rating){
        this.type = type;
        this.artist = artist;
        this.title = title;
        this.publication = publication;
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getPublication() {
        return publication;
    }

    public int getRating() {
        return rating;
    }
}
