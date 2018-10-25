package BusinessLogic;

import Domain.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeManagerTest {
    @Test
    public void calculateTotalVolume() throws Exception {
        ShapeManager shapeManager = new ShapeManager();
        assertEquals(0.0, shapeManager.calculateTotalVolume(), 0.00001);

        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(5.0, 6.0);
        Cone cone = new Cone(3, 4);
        RectangularPrism rectangularPrism = new RectangularPrism(3.0, 4.0, 5.0);
        SquarePyramid squarePyramid = new SquarePyramid(3.0, 2.0);
        Octagon octagon = new Octagon(4, 4);
        Pentagon pentagon = new Pentagon(9, 2);

        shapeManager.add(sphere);
        shapeManager.add(cylinder);
        shapeManager.add(cone);
        shapeManager.add(rectangularPrism);
        shapeManager.add(squarePyramid);
        shapeManager.add(octagon);
        shapeManager.add(pentagon);

        assertEquals(1686.27346, shapeManager.calculateTotalVolume(), 0.00001);

    }

}