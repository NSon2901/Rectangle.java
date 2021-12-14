package shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double lenght){
        super();
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(String color, boolean filled){
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return width * lenght;
    }
    public double getPerimeter(){
        return (width + lenght) * 2;
    }
    @Override
    public String toString(){
        return "Rectangle[Shape[color=" + getColor()
                + ",filled=" + super.isFilled()
                + "], width=" + getWidth()
                + ", length" + getLenght()
                +"]";
    }
}
