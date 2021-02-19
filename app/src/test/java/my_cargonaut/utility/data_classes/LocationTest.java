package my_cargonaut.utility.data_classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Location class")
public class LocationTest {

    private final double lon = 1.0;
    private final  double lat = 2.0;
    private final String loc = "Location";
    private final String cou = "Country";
    private final Location testLoc = new Location(lon, lat, loc, cou);

    @Test
    @DisplayName("getLongtitude() returns correct value")
    public void getLongtitudeReturnsCorrectVal() {
        Assertions.assertEquals(lon, testLoc.getLongtitude());
    }

    @Test
    @DisplayName("getLatitude() returns correct value")
    public void getLatitudeReturnsCorrectVal() {
        Assertions.assertEquals(lat, testLoc.getLatitude());
    }

    @Test
    @DisplayName("getLocationName() returns correct value")
    public void getLocationNameReturnsCorrectVal() {
        Assertions.assertEquals(loc, testLoc.getLocationName());
    }

    @Test
    @DisplayName("getCountry() returns correct value")
    public void getCountryReturnsCorrectVal() {
        Assertions.assertEquals(cou, testLoc.getCountry());
    }
}
