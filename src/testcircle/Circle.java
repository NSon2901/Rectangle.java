package testcircle;

public class Circle {
    private Point center;
    private double radius = 1.0;
    public Circle(){
        this.center = new Point(0,0);
        this.radius = 1.0;
    }
    public Circle(int xCenter, int yCenter, double radius){
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public double getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public double getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "center=(" + center.getX() + "," + center.getY() +
                "), radius=" + radius +
                ']';
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return Math.PI * 2.0 * radius;
    }
    public double distance(Circle another){
        return center.distance(another.center);
    }
}
