package my_cargonaut.utility.data_classes.offers;

import my_cargonaut.utility.data_classes.Location;
import my_cargonaut.utility.data_classes.user.User;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;

@DisplayName("Testing OfferPool class")
public class OfferPoolTest {

    @Test
    @DisplayName("getInstance() returns an OfferPool object")
    public void getInstanceReturnsOfferPool() {
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

    @Nested
    @DisplayName("Testing OfferFilter class")
    public class OfferFilterTest {


        private List<Offer> createOfferList() {
            User user1 = new User("user1", "user1");
            User user2 = new User("user2", "user2");
            User user3 = new User("user3", "user3");

            Location loc1 = new Location(1.0, 1.0, "loc1", "country1");
            Location loc2 = new Location(2.0, 2.0, "loc2", "country1");
            Location loc3 = new Location(50.0, 51.0, "loc3", "country3");

            return new LinkedList<Offer>();
        }
    }
}
