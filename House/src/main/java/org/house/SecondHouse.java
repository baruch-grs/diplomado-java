package org.house;

public class SecondHouse {
    private String city;
    private String neighborhood;
    private String color;
    private int bedrooms;
    private int bathrooms;
    private int kitchens;

    private int floors;

    public SecondHouse(String city, String neighborhood, String color) {
        this.city = city;
        this.neighborhood = neighborhood;
        this.color = color;
    }
    public SecondHouse(String city, String color, int floors) {
        this.city = city;
        this.color = color;
        this.floors = floors;
    }
    public SecondHouse(int floors, int bedrooms, int bathrooms, int kitchens) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.kitchens = kitchens;
    }

    public String getCity() {
        return city;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public String getColor() {
        return color;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }
    public int getKitchens() {
        return kitchens;
    }

    public int getFloors() {
        return floors;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setKitchens(int kitchens) {
        this.kitchens = kitchens;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
