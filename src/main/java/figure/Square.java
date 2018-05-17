package figure;

public class Square {
    double side;

    public Square(final double side) {
        this.side = side;
    }

    public Square(Circle circle) {
        new Square(Math.sqrt(Math.PI)*circle.getRadius());
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return 4*side;
    }
    public String toString() {
        return "Square "+side;
    }
    public Circle getInscribedCircle() {
        return new Circle(side/2);
    }
    public Circle getCircumscribedCircle() {
        return new Circle(Math.sqrt(2)*side/2);
    }
    public static Circle[] getCircles(Square[] arr) {
        Circle[] aCircle = new Circle[arr.length-1];
        for(int i = 0; i<arr.length-1; i++) {
            double a = arr[i].getSide();
            double r = a/Math.sqrt(Math.PI);
            aCircle[i] = new Circle(r);
        }
        return aCircle;
    }

}
