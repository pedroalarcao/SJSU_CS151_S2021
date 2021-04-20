/**
 *
 */
class Hexagon implements Shape{

    /**
     *
     */
    private double side;

    /**
     *
     * @param side
     */
    public Hexagon(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hexagon side: " + this.getSide();
    }

    /**
     * 
     * @return
     */
    @Override
    synchronized public double computeArea() {

        double area = ((Math.sqrt(3)*3/2) * side * side);
        //System.out.println("Area of Hexagon: " + area);
        return area;

    }
}
