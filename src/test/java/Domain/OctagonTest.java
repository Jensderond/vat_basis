package Domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OctagonTest {
    @Test
    public void calculateVolume() throws Exception {
        Octagon octagon = new Octagon(4, 4);
        assertEquals(309.01933, octagon.calculateVolume(), 0.00001);
    }

}