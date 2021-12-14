package testcircle;

public class Point {
    private int x = 0;
    private int y = 0;
    public Point(){
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() +")";
    }
    public int[] getXY(){
        return new int[]{this.x, this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y){
        double distantX = Math.pow(this.x - x,2.0);
        double distanceY = Math.pow(this.y - y,2.0);
        return Math.pow(distantX + distanceY,0.5);
    }
    public double distance(Point another){
        double distantX = Math.pow(this.x - another.x,2.0);
        double distanceY = Math.pow(this.y - another.y,2.0);
        return Math.pow(distantX + distanceY,0.5);
    }
    public double distance(){
        double distantX = Math.pow(this.x, 2.0);
        double distanceY = Math.pow(this.y,2.0);
        return Math.pow(distantX + distanceY,0.5);
    }
}
