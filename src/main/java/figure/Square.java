package figure;

public class Square {
    private double side;

    public Square(double side) {
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
    @Override
    public String toString() {
        return "Square ["+side+"]";
    }
    public Circle getInscribedCircle() {
        return new Circle(side/2);
    }
    public Circle getCircumscribedCircle() {
        return new Circle(Math.sqrt(2)*side/2);
    }
    public static Circle[] getCircles(Square[] arr) {
        Circle[] aCircle = new Circle[arr.length];
        for(int i = 0; i<arr.length; i++) {
            double a = arr[i].getSide();
            double r = a/Math.sqrt(Math.PI);
            aCircle[i] = new Circle(r);
        }
        return aCircle;
    }

}
