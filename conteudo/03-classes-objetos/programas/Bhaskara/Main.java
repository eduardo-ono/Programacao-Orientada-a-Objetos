
public class Main {

    public static void main(String args[]) {
        Bhaskara eq = new Bhaskara();
        eq.setA(2.0);
        eq.setB(-10);
        eq.setC(12);
        eq.calcularRaizes();
        System.out.println(eq.getX1());
        System.out.println(eq.getX2());
    }
}

