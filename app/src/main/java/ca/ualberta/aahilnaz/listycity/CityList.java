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

    /** Returns whether a given city exists in the list. */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /** Removes a city; throws if missing. */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /** Returns number of cities. */
    public int countCities() {
        return cities.size();
    }

    /** Returns the list sorted by city name. */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
