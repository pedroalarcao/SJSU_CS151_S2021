/**
 *
 */
public class Circle implements Shape{

    /**
     *
     */
    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    @Override
        public String toString() {
            return "Circle radius: " + this.getRadius();
        }

    /**
     *
     * @return
     */
    @Override
    synchronized public double computeArea() {

        double area = (Math.PI * getRadius() * getRadius());
        //System.out.println("Area of Circle: " + area);
        return area;

    }


}
