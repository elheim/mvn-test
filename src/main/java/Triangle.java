import java.text.DecimalFormat;

public class Triangle {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){
        checkPositive(a);
        checkPositive(b);
        checkPositive(c);
        checkSideLength(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double newA){
        checkPositive(newA);
        this.a = newA;
        checkSideLength(newA, b, c);
    }

    public void setB(double newB){
        checkPositive(newB);
        this.b = newB;
        checkSideLength(a, newB, c);
    }

    public void setC(double newC){
        checkPositive(newC);
        this.c = newC;
        checkSideLength(a, b, newC);
    }

    public void checkPositive(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Expected positive, got " + length);
        }
    }

    public void checkSideLength(double a, double b, double c){
        if ((a + b) <= c ){
             throw new IllegalArgumentException("Variable " + c + " expected to be smaller");
        }
        if ((b + c) <= a) {
             throw new IllegalArgumentException("Variable " + a + " expected to be smaller");
        }
        if ((c + a) <= b) {
             throw new IllegalArgumentException("Variable " + b + " expected to be smaller");
        }
    }

    public double calcArea(){
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        DecimalFormat df = new DecimalFormat("0.0");
        return Double.parseDouble(df.format(s));
    }
}
