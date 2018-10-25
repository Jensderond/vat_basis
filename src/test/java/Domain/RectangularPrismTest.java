package Domain;


import org.junit.Test;

import static org.junit.Assert.*;

public class RectangularPrismTest {
    @Test
    public void calculateVolume() throws Exception {
        RectangularPrism rectangularPrism = new RectangularPrism(3.0, 4.0, 5.0);
        assertEquals(60.0, rectangularPrism.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateSecondVolume() throws Exception {
        RectangularPrism rectangularPrism = new RectangularPrism(6.54, 8.69, 5.36);
        assertEquals(304.62273, rectangularPrism.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateThirdVolume() throws Exception {
        RectangularPrism rectangularPrism = new RectangularPrism(12.79, 16.93, 3.45);
        assertEquals(747.04471, rectangularPrism.calculateVolume(), 0.00001);
    }

}