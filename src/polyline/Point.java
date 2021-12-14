package polyline;
public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int[] getXY(){
        int[] xy = {this.x, this.y};
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return this.x + " " + this.y;
    }
    public double distance(Point another){
        double xsqr = Math.pow(this.x - another.x, 2.0);
        double ysqr = Math.pow(this.y - another.y, 2.0);
        return Math.pow(xsqr - ysqr, 0.5);
    }
}