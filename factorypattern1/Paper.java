public class Paper {
    public static void main(String args[]){
        ShapeFactory factory = new ShapeFactory();
        Shape square = factory.getShape(ShapeType.SQUARE);
        Shape circle = factory.getShape(ShapeType.CIRCLE);
        circle.draw();
        square.draw();
    
    }
}