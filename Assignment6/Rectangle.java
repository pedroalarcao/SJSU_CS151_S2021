/**
 *
 */
class Rectangle implements Shape{
    /**
     *
     */
    private double height;

    /**
     *
     */
    private double width;

    /**
     *
     * @param height
     * @param width
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rectangle height: " + this.getHeight() + '\n' +
                "Rectangle width: " + this.getWidth();
    }

    /**
     *
     * @return
     */
    @Override
    synchronized public double computeArea() {

        double area = (getHeight() * getWidth());
        //System.out.println("Area of Rectangle: " + area);
        return area;

    }
}
