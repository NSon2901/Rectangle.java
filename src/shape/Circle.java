package shape;
public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[Shape[color=" + getColor()
                + ",filled=" + super.isFilled()
                + "], radius=" + getRadius()
                +"]";
    }
}
