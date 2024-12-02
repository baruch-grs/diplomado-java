package org.city;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        City city = new City();
        city.setName("Mexico City");
        city.setCountry("Mexico");
        city.setPopulation(128500000);
        city.setPresident("Claudia");

        System.out.println(city.getName());
        System.out.println(city.getCountry());
        System.out.println(city.getPopulation());
        System.out.println(city.getPresident());
        

    }
}