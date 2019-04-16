public enum ShapeType {
    CIRCLE {
        public Shape getShape(){
            return new Circle();
        }
    },
    SQUARE {
        public Shape getShape(){
            return new Square();
        }
    };
    abstract Shape getShape();
}