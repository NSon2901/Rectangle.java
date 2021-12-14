package shape;

public class Square extends Rectangle{
    private double side;
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.side = this.side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }
    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color=" + super.getColor()
                + ",filled=" + super.isFilled()
                +"], width= " + getWidth()
                +",lenght=" + getLenght() +"]]";
    }
}
