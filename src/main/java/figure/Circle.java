package figure;

public class Circle {
    double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public Circle(Square square) {
        new Circle(square.getSide()/Math.sqrt(Math.PI));
    }

    public double getArea() {
        return Math.PI * radius*radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle "+radius;
    }
    public Square getInscribedSquare() {
        return new Square(radius*Math.sqrt(2));
    }
    public Square getCircumscribedSquare() {
        return new Square(2*radius);
    }
    public static Square[] getSquares(Circle[] arr) {
        Square[] aSquare = new Square[arr.length-1];
        for(int i = 0; i<arr.length-1; i++) {
            double r = arr[i].getRadius();
            double a = r*Math.sqrt(Math.PI);
            aSquare[i] = new Square(a);
        }
        return aSquare;
    }

}
