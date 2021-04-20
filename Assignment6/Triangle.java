/**
 *
 */
class Triangle implements Shape{

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
    public Triangle(double height, double width) {
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
        return "Triangle height: " + this.getHeight() + '\n' +
                "Triangle width: " + this.getWidth();
    }

    /**
     *
     * @return
     */
    @Override
    synchronized public double computeArea() {

        double area = (getHeight() * getWidth() * 0.5);
        //System.out.println("Area of Triangle: " + area);
        return area;

    }
}
