package my_cargonaut.utility.data_classes.offers;

import my_cargonaut.utility.FormManUtils;
import my_cargonaut.utility.data_classes.Location;
import my_cargonaut.utility.data_classes.Measurements;
import my_cargonaut.utility.data_classes.Tour;
import my_cargonaut.utility.data_classes.Vehicle;
import my_cargonaut.utility.data_classes.user.User;
import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Testing OfferPool class")
public class OfferPoolTest {

    private OfferPool testOfferPool;
    private List<Offer> offerList;

    @BeforeAll
    public void fillOfferList() throws ParseException {
        testOfferPool = OfferPool.getInstance();
        offerList = createOfferList();
        offerList.forEach(offer -> testOfferPool.addOffer(offer));
    }

    @Test
    @DisplayName("getInstance() returns an OfferPool object")
    void getInstanceReturnsOfferPool() {
        Assertions.assertNotNull(OfferPool.getInstance());
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

    private static List<Offer> createOfferList() throws ParseException {
        User u1 = new User("user1", "user1");
        User u2 = new User("user2", "user2");
        User u3 = new User("user3", "user3");

        Location l1 = new Location(1.0, 1.0, "loc1", "country1");
        Location l2 = new Location(2.0, 2.0, "loc2", "country1");
        Location l3 = new Location(50.0, 51.0, "loc3", "country3");

        Date d1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-3-1T12:00");
                //new Date(2021, Calendar.MARCH, 1);
        Date d2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-3-10T12:00");
                //new Date(2021, Calendar.MARCH, 10);
        Date d3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-2-10T12:00");
                //new Date(2021, Calendar.FEBRUARY, 10);

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
        OfferPool.OfferFilter testOfferFilter = testOfferPool.getOfferFilter();
        Map<String, Double> nonMockitoMockMap;
        Map<String, Double> mockMap = mock(Map.class);

        @BeforeAll
        void initMockMap() {
            nonMockitoMockMap = new HashMap<>();
        }

        @BeforeEach
        void reMockFilter() {
            testOfferFilter = testOfferPool.getOfferFilter();
            nonMockitoMockMap.put("height", hei);
            nonMockitoMockMap.put("width", wid);
            nonMockitoMockMap.put("depth", dep);
            nonMockitoMockMap.put("weight", wei);
        }

        @Test
        @DisplayName("setMeasurementsMap() sets the measurements")
        void setMeasurementsMapSetsMeasurements() {
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            Assertions.assertTrue(testOfferFilter.getHeight().isPresent());
            Assertions.assertEquals(hei, testOfferFilter.getHeight().get());

            Assertions.assertTrue(testOfferFilter.getWidth().isPresent());
            Assertions.assertEquals(wid, testOfferFilter.getWidth().get());

            Assertions.assertTrue(testOfferFilter.getDepth().isPresent());
            Assertions.assertEquals(dep, testOfferFilter.getDepth().get());

            Assertions.assertTrue(testOfferFilter.getWeight().isPresent());
            Assertions.assertEquals(wei, testOfferFilter.getWeight().get());
        }

        @Test
        @DisplayName("getHeight() returns empty Optional if field is null")
        void getHeightReturnsEmptyIfNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("height")).thenReturn(null);
            Assertions.assertTrue(testOfferFilter.getHeight().isEmpty());
        }

        @Test
        @DisplayName("getHeight() returns non-empty Optional if field is null")
        void getHeightReturnsValueIfNotNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("height")).thenReturn(hei);
            Assertions.assertFalse(testOfferFilter.getHeight().isEmpty());
        }

        @Test
        @DisplayName("getWidth() returns empty Optional if field is null")
        void getWidthReturnsEmptyIfNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("width")).thenReturn(null);
            Assertions.assertTrue(testOfferFilter.getWidth().isEmpty());
        }

        @Test
        @DisplayName("getWidth() returns non-empty Optional if field is null")
        void getWidthReturnsValueIfNotNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("width")).thenReturn(wid);
            Assertions.assertFalse(testOfferFilter.getWidth().isEmpty());
        }

        @Test
        @DisplayName("getDepth() returns empty Optional if field is null")
        void getDepthReturnsEmptyIfNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("depth")).thenReturn(null);
            Assertions.assertTrue(testOfferFilter.getDepth().isEmpty());
        }

        @Test
        @DisplayName("getDepth() returns non-empty Optional if field is null")
        void getDepthReturnsValueIfNotNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("depth")).thenReturn(dep);
            Assertions.assertFalse(testOfferFilter.getDepth().isEmpty());
        }

        @Test
        @DisplayName("getWeight() returns empty Optional if field is null")
        void getWeightReturnsEmptyIfNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("weight")).thenReturn(null);
            Assertions.assertTrue(testOfferFilter.getWeight().isEmpty());
        }

        @Test
        @DisplayName("getWeight() returns non-empty Optional if field is null")
        void getWeightReturnsValueIfNotNull() {
            testOfferFilter.setMeasurementsMap(mockMap);
            when(mockMap.get("weight")).thenReturn(wei);
            Assertions.assertFalse(testOfferFilter.getWeight().isEmpty());
        }

        @Test
        @DisplayName("filtering offers without input does return the whole list")
        void applyFilterWithoutFilterArgumentsReturnsWholeList() {
            List<Offer> filteredList = testOfferFilter.applyFilter();
            Assertions.assertEquals(offerList, filteredList);
        }

        @Test
        @DisplayName("filtering by a specific User only returns offers by that user")
        void applyFilterWithUser() {
            List<Offer> filteredList;
            User u = offerList.get(0).getUser();
            testOfferFilter.setUser(u);
            filteredList = testOfferFilter.applyFilter();
            for(Offer offer : filteredList) {
                Assertions.assertEquals(u, offer.getUser());
            }
        }

        @Test
        @DisplayName("filtering by starting location does exclude offers")
        void applyFilterByStartLocationExclusionTest() {
            List<Offer> filteredList;
            Location loc = new Location(80.0, 80.0, "notHere", "noMansLand");
            testOfferFilter.setStartLoc(loc);
            filteredList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, filteredList.size());
        }

        @Test
        @DisplayName("filtering by starting location only returns offers starting from this location")
        void applyFilterByStartLocationFilterTest() {
            List<Offer> filteredList;
            Location loc = offerList.get(0).getRoute().getStartLoc();
            testOfferFilter.setStartLoc(loc);
            filteredList = testOfferFilter.applyFilter();

            for(Offer offer : filteredList) {
                Assertions.assertEquals(loc, offer.getRoute().getStartLoc());
            }
        }

        @Test
        @DisplayName("filtering by destination does exclude offers")
        void applyFilterByDestinationExclusionTest() {
            List<Offer> filteredList;
            Location loc = new Location(80.0, 80.0, "notHere", "noMansLand");
            testOfferFilter.setDestLoc(loc);
            filteredList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, filteredList.size());
        }

        @Test
        @DisplayName("filtering by destination only returns offers starting from this location")
        void applyFilterByDestinationFilterTest() {
            List<Offer> filteredList;
            Location loc = offerList.get(0).getRoute().getEndLoc();
            testOfferFilter.setDestLoc(loc);
            filteredList = testOfferFilter.applyFilter();

            for(Offer offer : filteredList) {
                Assertions.assertEquals(loc, offer.getRoute().getEndLoc());
            }
        }

        @Test
        @DisplayName("filtering by start date does exclude offers")
        void applyFilterByStartDateExclusionTest() throws ParseException {
            List<Offer> filteredList;
            Date filterStartDate = FormManUtils.parseDateFromFromParam("2022-12-24T12:00");
            testOfferFilter.setStartDate(filterStartDate);
            filteredList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, filteredList.size());
        }

        @Test
        @DisplayName("filtering by start date only returns offers starting afterwards")
        void applyFilterByStartDateFilterTest() throws ParseException {
            List<Offer> filteredList;
            Date filterStartDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-02-25T12:00");
            testOfferFilter.setStartDate(filterStartDate);
            filteredList = testOfferFilter.applyFilter();

            for(Offer offer : filteredList) {
                Assertions.assertTrue(filterStartDate.before(offer.getRoute().getStartTime()));
            }
        }

        @Test
        @DisplayName("filtering by start date only returns offers starting afterwards & before its end date")
        void applyFilterByStartDateFilterTestWithEndDate() throws ParseException {
            List<Offer> filteredList;
            Date filterStartDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-02-25T12:00");
            Date filterEndDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse("2021-03-02T12:00");
            testOfferFilter.setStartDate(filterStartDate);
            testOfferFilter.setEndDate(filterEndDate);
            filteredList = testOfferFilter.applyFilter();

            for(Offer offer : filteredList) {
                Assertions.assertTrue(filterStartDate.before(offer.getRoute().getStartTime()));
                Assertions.assertTrue(filterEndDate.after(offer.getRoute().getStartTime()));
            }
        }

        @Test
        void applyFilterByAvailFreeSpaceHeightExclusionTest() {
            List<Offer> resList;
            Measurements requiredFreeSpace = new Measurements(2000.0, 0.0, 0.0, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, resList.size());
        }

        @Test
        void applyFilterByAvailFreeSpaceHeightFilterTest() {
            List<Offer> resList;
            double value = 80.0;
            Measurements requiredFreeSpace = new Measurements(value, 0.0, 0.0, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                if(offer.getFreeSpace().isPresent()) {
                    Assertions.assertTrue(value < offer.getFreeSpace().get().getHeight());
                }
            }
        }

        @Test
        void applyFilterByAvailFreeSpaceWidthExclusionTest() {
            List<Offer> resList;
            Measurements requiredFreeSpace = new Measurements(0.0, 2000.0, 0.0, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, resList.size());
        }

        @Test
        void applyFilterByAvailFreeSpaceWidthFilterTest() {
            List<Offer> resList;
            double value = 180.0;
            Measurements requiredFreeSpace = new Measurements(0.0, value, 0.0, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                if(offer.getFreeSpace().isPresent()) {
                    Assertions.assertTrue(value < offer.getFreeSpace().get().getWidth());
                }
            }
        }

        @Test
        void applyFilterByAvailFreeSpaceDepthExclusionTest() {
            List<Offer> resList;
            Measurements requiredFreeSpace = new Measurements(0.0, 0.0, 2000.0, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, resList.size());
        }

        @Test
        void applyFilterByAvailFreeSpaceDepthFilterTest() {
            List<Offer> resList;
            double value = 280.0;
            Measurements requiredFreeSpace = new Measurements(0.0, 0.0, value, 0.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                if(offer.getFreeSpace().isPresent()) {
                    Assertions.assertTrue(value < offer.getFreeSpace().get().getDepth());
                }
            }
        }

        @Test
        void applyFilterByAvailFreeSpaceWeightExclusionTest() {
            List<Offer> resList;
            Measurements requiredFreeSpace = new Measurements(0.0, 0.0, 0.0, 2000.0);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            Assertions.assertEquals(0, resList.size());
        }

        @Test
        void applyFilterByAvailFreeSpaceWeightFilterTest() {
            List<Offer> resList;
            double value = 380.0;
            Measurements requiredFreeSpace = new Measurements(0.0, 0.0, 0.0, value);
            testOfferFilter.setFreeSpace(requiredFreeSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                if(offer.getFreeSpace().isPresent()) {
                    Assertions.assertTrue(value < offer.getFreeSpace().get().getWeight());
                }
            }
        }

        @Test
        @DisplayName("filter for checking whether a given cargos height fits in vehicle excludes entries")
        void applyFilterWithCargoHeightExclusionTest() {
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("height", 20000.0);
            resList = testOfferFilter.applyFilter();
            Assertions.assertEquals(0, resList.size());
        }

        @Test
        @DisplayName("filter for checking whether a given cargos height fits in vehicle filters correctly")
        void applyFilterWithCargoHeightTest() {
            double requiredSpace = 80.0;
            double freeSpace;
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("height", requiredSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                freeSpace = offer.getFreeSpace().orElseThrow(IllegalStateException::new).getHeight();
                Assertions.assertTrue(requiredSpace <= freeSpace);
            }
        }

        @Test
        @DisplayName("filter for checking whether a given cargos width fits in vehicle excludes entries")
        void applyFilterWithCargoWidthExclusionTest() {
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("width", 20000.0);
            resList = testOfferFilter.applyFilter();
            Assertions.assertEquals(0, resList.size());
        }

        @Test
        @DisplayName("filter for checking whether a given cargos width fits in vehicle filters correctly")
        void applyFilterWithCargoWidthTest() {
            double requiredSpace = 180.0;
            double freeSpace;
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("width", requiredSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                freeSpace = offer.getFreeSpace().orElseThrow(IllegalStateException::new).getWidth();
                Assertions.assertTrue(requiredSpace <= freeSpace);
            }
        }

        @Test
        @DisplayName("filter for checking whether a given cargos depth fits in vehicle excludes entries")
        void applyFilterWithCargoDepthExclusionTest() {
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("depth", 20000.0);
            resList = testOfferFilter.applyFilter();
            Assertions.assertEquals(0, resList.size());
        }

        @Test
        @DisplayName("filter for checking whether a given cargos depth fits in vehicle filters correctly")
        void applyFilterWithCargoDepthTest() {
            double requiredSpace = 280.0;
            double freeSpace;
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("depth", requiredSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                freeSpace = offer.getFreeSpace().orElseThrow(IllegalStateException::new).getDepth();
                Assertions.assertTrue(requiredSpace <= freeSpace);
            }
        }

        @Test
        @DisplayName("filter for checking whether a given cargos weight fits in vehicle excludes entries")
        void applyFilterWithCargoWeightExclusionTest() {
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("weight", 20000.0);
            resList = testOfferFilter.applyFilter();
            Assertions.assertEquals(0, resList.size());
        }

        @Test
        @DisplayName("filter for checking whether a given cargos weight fits in vehicle filters correctly")
        void applyFilterWithCargoWeightTest() {
            double requiredSpace = 280.0;
            double freeSpace;
            List<Offer> resList;
            testOfferFilter.setMeasurementsMap(nonMockitoMockMap);
            nonMockitoMockMap.replace("weight", requiredSpace);
            resList = testOfferFilter.applyFilter();

            for(Offer offer : resList) {
                freeSpace = offer.getFreeSpace().orElseThrow(IllegalStateException::new).getWeight();
                Assertions.assertTrue(requiredSpace <= freeSpace);
            }
        }


        
    }
}
