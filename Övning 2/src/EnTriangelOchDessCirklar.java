import java.util.*;

//EnTriangelOchDessCirklar.java

class EnTriangelOchDessCirklar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Side A of triangle: ");
            double a = in.nextDouble();

        System.out.println("Side B of triangle: ");
            double b = in.nextDouble();

        System.out.println("Side C of triangle: ");
            double c = in.nextDouble();

        Triangel.Circumference(a, b, c);

        System.out.println("Radie för omskriven cirkel: " + Triangel.RadiusOuter(a,b,c) + " cm");
        System.out.println("Radie för inskriven cirkel: " + Triangel.RadiusInner(a,b,c) + " cm");
    }
}
