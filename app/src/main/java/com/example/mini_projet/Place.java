package com.example.mini_projet;

public class Place {
    private String name;
    private String description;
    private int image1; // ID for first image
    private int image2; // ID for second image

    public Place(String name, String description, int image1, int image2) {
        this.name = name;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getImage1() { return image1; }
    public int getImage2() { return image2; }

}
