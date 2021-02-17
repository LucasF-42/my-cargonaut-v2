package my_cargonaut.utility.data_classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Size class")
public class SizeTest {

    private final double hei = 10.0;
    private final double wid = 20.0;
    private final double dep = 5.0;
    private final Size testSize = new Size(hei, wid, dep);

    @Test
    @DisplayName("getHeight() returns correct value")
    public void getHeightReturnsCorrectVal() {
        Assertions.assertEquals(hei, testSize.getHeight());
    }

    @Test
    @DisplayName("getWidth() returns correct value")
    public void getWidthReturnsCorrectVal() {
        Assertions.assertEquals(wid, testSize.getWidth());
    }

    @Test
    @DisplayName("getDepth() returns correct value")
    public void getDepthReturnsCorrectVal() {
        Assertions.assertEquals(dep, testSize.getDepth());
    }
}
