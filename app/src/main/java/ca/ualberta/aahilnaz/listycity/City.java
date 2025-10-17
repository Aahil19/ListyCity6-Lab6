package ca.ualberta.aahilnaz.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /** The name of the city. */
    private String city;
    /** The province the city belongs to. */
    private String province;

    /**
     * Constructs a City object.
     * @param city the name of the city
     * @param province the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province.
     * @return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares cities alphabetically by city name.
     * @param o the other city
     * @return comparison by city name
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /** Two cities are equal if both city and province match. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city)
                && Objects.equals(province, other.province);
    }

    /** Hash code consistent with equals(city, province). */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
