package mycomplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // 3 + 5i
    public String toString() {
        return "(" + String.valueOf(real) + " + " + String.valueOf(imag) + "i" + ")";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    // 0 + 2i
    public boolean isImaginary() {
        return this.real == 0 && this.imag != 0;
    }

    public boolean euquals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean euquals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        double x = this.real;
        double y = this.imag;
        return Math.sqrt(x * x + y * y);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double x = this.real + right.real;
        double y = this.imag + right.imag;
        return new MyComplex(x, y);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double x = this.real - right.real;
        double y = this.imag - right.imag;
        return new MyComplex(x, y);
    }

    public MyComplex multiply(MyComplex right) {
        double a = this.real;
        double b = this.imag;
        double c = right.real;
        double d = right.imag;
        this.real = a * c - b * d;
        this.imag = a * d + b * c;
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        double a = this.real;
        double b = this.imag;
        double c = right.real;
        double d = right.imag;
        return new MyComplex(a * c - b * d, a * d + b * c);
    }

    public MyComplex divide(MyComplex right) {
        double c = right.real;
        double d = right.imag;
        MyComplex newComplexNumber = new MyComplex(c, -d);
        MyComplex productComplexNumber = multiplyNew(newComplexNumber);
        double divided = c * c + d * d;
        this.real = productComplexNumber.real / divided;
        this.imag = productComplexNumber.imag / divided;
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
