package com.example.theeagle.tourguideapp.model;

public class LocationModel {
    private String placeName;
    private String description;
    private int imageId;


    public LocationModel(String placeName, String description, int imageId) {
        this.placeName = placeName;
        this.description = description;
        this.imageId = imageId;

    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
