package inheritance.point;

import polyline.Point;

public class Point3D extends Point2D{
    private float z;
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

   /*
    public float[] getXYZ() {
        float[] arr = new float[]{this.getXY()[0],this.getXY()[1], this.z};
       // return new float[]{this.getXY()[0], this.getXY()[1], this.z};
        return arr;
    }

*/

        public float[] getXYZ() {
            float[] get = new float[3];
            get[0] = this.getX();
            get[1] = this.getY();
            get[2] = this.z;
            return get;
        }

    @Override
    public String toString() {
        return "(" + super.getX()+"," + super.getY() +","+ getZ() + ")";
    }
}
