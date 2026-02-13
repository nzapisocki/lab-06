package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This checks if a city is already in the list
     * @param city
     * This is a candidate city to check
     * @return
     * returns true if a city is in the list
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }
    /**
     * Deletes a city from the list
     * @param city
     * The city to be deleted
     */
    public void delete(City city) {
        if (cities.contains(city)){
            cities.remove(city);
        }
        else
        {
            throw new IllegalArgumentException("City is not in the list");
        }

    }
    /**
     * Gets the count of the cities
     * @return
     * city count
     */
    public int countCities(){
        return cities.size();
    }


}


