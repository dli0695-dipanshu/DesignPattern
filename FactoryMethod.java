
//Product interface
interface Shape{
    String getDescription();
}

// Concrete products
class Square implements Shape{

    @Override
    public String getDescription() {
        return "This is a square";
    }
}

class Circle implements Shape{

    @Override
    public String getDescription() {
        return "This is a Circle";
    }
}

//Creator abstract class
abstract  class ShapeFactory{
    abstract Shape createShape();

    public void  describeShape(){
        Shape shape=createShape();
        System.out.println(shape.getDescription());
    }
}

// Concrete creators
class SquareFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Square();
    }
}
class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}

// Usage
public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory squareFactory= new SquareFactory();
        squareFactory.describeShape();

        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.describeShape();
    }
}
