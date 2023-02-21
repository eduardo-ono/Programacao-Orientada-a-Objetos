import java.lang.Math;

public class Bhaskara {

    private double a, b, c;
    private double x1, x2;

    // Construtores

    // Construtor default
    Bhaskara() { }

    Bhaskara(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        calcularRaizes();
    }

    // Métodos
    
    // Getters
    public double getA() { return this.a; }
    public double getB() { return this.b; }
    public double getC() { return this.c; }
    public double getX1() { return this.x1; }
    public double getX2() { return this.x2; }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void calcularRaizes() {
        double delta = b * b - 4 * a * c;
        if (a != 0 && delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}

