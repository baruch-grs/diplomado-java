package org.house;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        House firstHouse = new House();
        SecondHouse secondHouseFirstExample = new SecondHouse("Mexico City", "Blue", 2);
        SecondHouse secondHouseSecondExample = new SecondHouse("Huehuetoca", "Huehuetoca", "Blue");
        SecondHouse secondHouseThirdExample = new SecondHouse(2, 3, 2, 1);
        System.out.println("City: " + firstHouse.getCity());
        System.out.println("Color: " + firstHouse.getColor());
        System.out.println("Bathrooms: " + firstHouse.getBathrooms());
        System.out.println("Bedrooms: " + firstHouse.getBedrooms());
        System.out.println("Neighborhood: " + firstHouse.getNeighborhood());
        System.out.println("Kitchens: " + firstHouse.getKitchens());
        System.out.println("--".repeat(50));
        System.out.println("City of second house: " + secondHouseFirstExample.getCity());
        System.out.println("Color of second house: " + secondHouseFirstExample.getColor());
        System.out.println("Floors of second house: " + secondHouseFirstExample.getFloors());
        System.out.println("City of second example second house: " + secondHouseSecondExample.getCity());
        System.out.println("Neighborhood of second example second house: " + secondHouseSecondExample.getNeighborhood());
        System.out.println("Color of second example second house: " + secondHouseSecondExample.getColor());
        System.out.println("Floors of third example second house: " + secondHouseThirdExample.getFloors());
        System.out.println("Bedrooms of third example second house: " + secondHouseThirdExample.getBedrooms());
        System.out.println("Bathrooms of third example second house: " + secondHouseThirdExample.getBathrooms());
        System.out.println("Kitchens of third example second house: " + secondHouseThirdExample.getKitchens());

    }
}