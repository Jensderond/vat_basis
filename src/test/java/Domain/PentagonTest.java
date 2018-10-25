package Domain;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

public class PentagonTest {
    @Test
    public void calculateVolume() throws Exception {
        Pentagon pentagon = new Pentagon(5, 4);
        assertEquals(172.04774, pentagon.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateAnotherVolume() throws Exception {
        Pentagon pentagon = new Pentagon(9, 2);
        assertEquals(278.71733, pentagon.calculateVolume(), 0.00001);
    }
}