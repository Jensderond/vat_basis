package Domain;

public class Octagon extends Shape {
    private double length;
    private double height;

    /**
     * Constructor use the parameters from the shape Octagon.
     * @param length
     * @param height
     */
    public Octagon(double length, double height) {
        this.length = length;
        this.height = height;
    }

    /**
     * Method getHeight
     *
     * @return
     */

    public double getHeight() {
        return height;
    }

    /**
     * Method getLength
     *
     * @return
     */

    public double getLength() {
        return length;
    }

    /**
     * Method setHeight
     *
     * @param height
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Method set Length
     *
     * @param length
     */

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Method toString to return String.format for calculateVolume.
     * @return
     */

    public String toString() {
        return this.getType() + " " + this.getLength() + " " + this.getHeight() + " (" + String.format("%.2f", this.calculateVolume()) + ")";
    }

    /**
     * Method CalculateVolume
     *
     * @return
     */
    @Override
    public double calculateVolume() {
//        return Math.PI * Math.pow(this.length, 2) * (this.height/ 3.0);
        return 2 * (1 +  Math.sqrt(2)) * Math.pow(this.length, 2) * this.height;
    }
}