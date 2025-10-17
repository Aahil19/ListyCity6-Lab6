package ca.ualberta.aahilnaz.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testHasCityTrueFalse() {
        CityList list = mockCityList();
        assertTrue(list.hasCity(mockCity())); // present
        City absent = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCity(absent));    // not present yet
        list.add(absent);
        assertTrue(list.hasCity(absent));     // now present
    }

    @Test
    void testDeleteRemoves() {
        CityList list = mockCityList();
        City target = new City("Regina", "Saskatchewan");
        list.add(target);
        assertTrue(list.hasCity(target));
        list.delete(target);
        assertFalse(list.hasCity(target));
    }

    @Test
    void testDeleteThrowsWhenMissing() {
        CityList list = mockCityList();
        City missing = new City("Yellowknife", "Northwest Territories");
        assertThrows(IllegalArgumentException.class, () -> list.delete(missing));
    }

    @Test
    void testCountCities() {
        CityList list = mockCityList();           // has 1
        assertEquals(1, list.countCities());
        list.add(new City("Regina", "Saskatchewan"));
        list.add(new City("Calgary", "Alberta"));
        assertEquals(3, list.countCities());
        list.delete(new City("Calgary", "Alberta"));
        assertEquals(2, list.countCities());
    }

}
