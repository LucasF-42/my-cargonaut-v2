package my_cargonaut.utility.data_classes.offers;

import my_cargonaut.utility.data_classes.Location;
import my_cargonaut.utility.data_classes.Measurements;
import my_cargonaut.utility.data_classes.Tour;
import my_cargonaut.utility.data_classes.Vehicle;
import my_cargonaut.utility.data_classes.user.User;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Testing OfferPool class")
public class OfferPoolTest {

    private OfferPool testOfferPool;

    @BeforeAll
    public void fillOfferList() {
        testOfferPool = OfferPool.getInstance();
        createOfferList().forEach(offer -> testOfferPool.addOffer(offer));
    }

    @Test
    @DisplayName("getInstance() returns an OfferPool object")
    void getInstanceReturnsOfferPool() {
        Assertions.assertTrue(OfferPool.getInstance() instanceof OfferPool);
    }

    @Test
    @DisplayName("getInstance() always returns the same instance of OfferPool")
    public void getInstanceReturnsSameInstance() {
        OfferPool tst = OfferPool.getInstance();
        Assertions.assertSame(tst, OfferPool.getInstance());
    }

    @Test
    @DisplayName("getOfferFilter() returns a different instance each time")
    public void getOfferFilterReturnsNewFilter() {
        OfferPool offerPool = OfferPool.getInstance();
        OfferPool.OfferFilter test = offerPool.getOfferFilter();
        Assertions.assertNotSame(test, offerPool.getOfferFilter());
    }

    private static List<Offer> createOfferList() {
        User u1 = new User("user1", "user1");
        User u2 = new User("user2", "user2");
        User u3 = new User("user3", "user3");

        Location l1 = new Location(1.0, 1.0, "loc1", "country1");
        Location l2 = new Location(2.0, 2.0, "loc2", "country1");
        Location l3 = new Location(50.0, 51.0, "loc3", "country3");

        Date d1 = new Date(2021, Calendar.MARCH, 1);
        Date d2 = new Date(2021, Calendar.MARCH, 10);
        Date d3 = new Date(2021, Calendar.FEBRUARY, 10);

        Measurements m1 = new Measurements(10.0, 20.0, 30.0, 40.0);
        Measurements m2 = new Measurements(100.0, 200.0, 300.0, 400.0);
        Measurements m3 = new Measurements(50.0, 50.0, 50.0, 50.0);

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        Offer o1 = new Offer(u1, new Tour(l1, l2, d1), m1, v1);
        Offer o2 = new Offer(u2, new Tour(l1, l2, d1), m2, v2);
        Offer o3 = new Offer(u3, new Tour(l1, l2, d3), m3, v3);
        Offer o4 = new Offer(u1, new Tour(l3,  l1, d2), m1, v1);
        Offer o5 = new Offer(u3, new Tour(l3, l1, d3), m3, v3);
        Offer o6 = new Offer(u2, new Tour(l2, l3, d3), m2, v2);

        return new LinkedList<>(Arrays.asList(o1, o2, o3, o4, o5, o6));
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @DisplayName("Testing OfferFilter class")
    public class OfferFilterTest {

        Double hei = 10.0;
        Double wid = 20.0;
        Double dep = 30.0;
        Double wei = 40.0;
        OfferPool.OfferFilter mockFilter = mock(OfferPool.OfferFilter.class);
        OfferPool.OfferFilter nonMockitoOfferFilter = testOfferPool.getOfferFilter();
        Map<String, Double> nonMockitoMockMap;
        Map mockMap = mock(Map.class);

        @BeforeAll
        void initMockMap() {
            nonMockitoMockMap = new HashMap<>();
            nonMockitoMockMap.put("height", hei);
            nonMockitoMockMap.put("width", wid);
            nonMockitoMockMap.put("depth", dep);
            nonMockitoMockMap.put("weight", wei);
        }

        @BeforeEach
        void reMockFilter() {
            mockFilter = mock(OfferPool.OfferFilter.class);
        }

        @Test
        @DisplayName("setMeasurementsMap() sets the measurements")
        void setMeasurementsMapSetsMeasurements() {
            nonMockitoOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            Assertions.assertTrue(nonMockitoOfferFilter.getHeight().isPresent());
            Assertions.assertEquals(hei, nonMockitoOfferFilter.getHeight().get());

            Assertions.assertTrue(nonMockitoOfferFilter.getWidth().isPresent());
            Assertions.assertEquals(wid, nonMockitoOfferFilter.getWidth().get());

            Assertions.assertTrue(nonMockitoOfferFilter.getDepth().isPresent());
            Assertions.assertEquals(dep, nonMockitoOfferFilter.getDepth().get());

            Assertions.assertTrue(nonMockitoOfferFilter.getWeight().isPresent());
            Assertions.assertEquals(wei, nonMockitoOfferFilter.getWeight().get());
        }

        @Test
        @DisplayName("getHeight() returns empty Optional if field is null")
        void getHeightReturnsEmptyIfNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("height")).thenReturn(null);
            Assertions.assertTrue(nonMockitoOfferFilter.getHeight().isEmpty());
        }

        @Test
        @DisplayName("getHeight() returns non-empty Optional if field is null")
        void getHeightReturnsValueifNotNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("height")).thenReturn(hei);
            Assertions.assertFalse(nonMockitoOfferFilter.getHeight().isEmpty());
        }

        @Test
        @DisplayName("getWidth() returns empty Optional if field is null")
        void getWidthReturnsEmptyIfNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("width")).thenReturn(null);
            Assertions.assertTrue(nonMockitoOfferFilter.getWidth().isEmpty());
        }

        @Test
        @DisplayName("getWidth() returns non-empty Optional if field is null")
        void getWidthReturnsValueifNotNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("width")).thenReturn(wid);
            Assertions.assertFalse(nonMockitoOfferFilter.getWidth().isEmpty());
        }

        @Test
        @DisplayName("getDepth() returns empty Optional if field is null")
        void getDepthReturnsEmptyIfNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("depth")).thenReturn(null);
            Assertions.assertTrue(nonMockitoOfferFilter.getDepth().isEmpty());
        }

        @Test
        @DisplayName("getDepth() returns non-empty Optional if field is null")
        void getDepthReturnsValueifNotNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("depth")).thenReturn(dep);
            Assertions.assertFalse(nonMockitoOfferFilter.getDepth().isEmpty());
        }

        @Test
        @DisplayName("getWeight() returns empty Optional if field is null")
        void getWeightReturnsEmptyIfNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("weight")).thenReturn(null);
            Assertions.assertTrue(nonMockitoOfferFilter.getWeight().isEmpty());
        }

        @Test
        @DisplayName("getWeight() returns non-empty Optional if field is null")
        void getWeightReturnsValueifNotNull() {
            nonMockitoOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("weight")).thenReturn(wei);
            Assertions.assertFalse(nonMockitoOfferFilter.getWeight().isEmpty());
        }

    }
}
