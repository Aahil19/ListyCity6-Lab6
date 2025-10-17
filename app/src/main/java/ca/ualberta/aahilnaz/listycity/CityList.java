package ca.ualberta.aahilnaz.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Keeps track of a list of {@link City} objects.
 */
public class CityList {
    /** Holds the list of City objects. */
    private final List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     * @param city the candidate city to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns whether a given city exists in the list.
     * @param city the city to check
     * @return {@code true} if the list contains {@code city}; {@code false} otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a given city from the list.
     * @param city the city to remove
     * @throws IllegalArgumentException if {@code city} is not present in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     * @return the size of the list
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities.
     * @return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
