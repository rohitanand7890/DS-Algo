package methods;

public class AreaOfCircle {
    public static void calcArea(double rad) {
        final double PI = 3.142;
        double area = PI * rad* rad;
        System.out.println("area of circle of radius "+rad+ " is " +area);
        return;

    }

    public static void main(String[] args) {
        System.out.println("program starts ...");
        calcArea(10);
        calcArea(2);

        System.out.println("program ends ...");
    }
}
