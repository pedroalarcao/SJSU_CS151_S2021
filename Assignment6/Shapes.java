/**
 *
 */

import java.util.ArrayList;

class Shapes {

    /**
     *
     */
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    /**
     *
     * @param shapeList
     */
    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    /**
     *
     * @return
     */
    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    /**
     *
     * @param shapeList
     */
    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    /**
     *
     * @param shape
     */
    public void add(Shape shape){
        shapeList.add(shape);
    }

    /**
     *
     * @param shape
     */
    public void remove(Shape shape){
        shapeList.remove(shape);
    }

    /**
     *
     */
    synchronized public void compute(){
        for(Shape shape: shapeList){
            System.out.println(shape.getClass().getSimpleName() + " area : " + Math.round(shape.computeArea()));
        }
    }

    /**
     *
     */
    public void max(){
        double max = 0;
        Shape maxShape = null;
        for(Shape shape: shapeList){
            if(shape.computeArea() > max){
                max = shape.computeArea();
                maxShape = shape;
            }
        }
        System.out.println("Shape with biggest area: " + maxShape.getClass().getSimpleName() + '\n' + maxShape.toString());
    }

    /**
     *
     */
    public void min(){
        double minValue = Double.MAX_VALUE;
        Shape minShape = null;
        for(Shape shape: shapeList){
            if(shape.computeArea() < minValue){
                minValue = shape.computeArea();
                minShape = shape;
            }
        }
        System.out.println("Shape with smallest area: " + minShape.getClass().getSimpleName() + '\n' + minShape.toString());
    }
}
