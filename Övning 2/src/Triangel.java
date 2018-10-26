import java.util.*;

//Triangel.java

class Triangel {

    //a = side a
    //b = side b
    //c = side c
    //alfa = vinkeln mellan två sidor

    public static double Area(double a, double b, double c){
        double halfCirc = Circumference(a,b,c) / 2;
        double sqrt = halfCirc*(halfCirc-a)*(halfCirc-b)*(halfCirc-c);
        double area = Math.sqrt(sqrt);

        return area;
    }

    public static double Circumference(double a, double b, double c) {
        double circ = (a + b + c);

        return circ;
    }

        //Omskriven cirkel radie

    public static double RadiusOuter(double a, double b, double c){
        double abc = a*b*c;
        double halfCirc = Circumference(a,b,c) / 2;
        double div = halfCirc*(halfCirc-a)*(halfCirc-b)*(halfCirc-c);
        double radiusOuter = (abc)/(4*(Math.sqrt(div)));

        return radiusOuter;
    }
        //Inskriven cirkel radie

    public static double RadiusInner(double a, double b, double c) {
        //arean delat på semiperimetern
        double halfCirc = Circumference(a, b, c) / 2;
        double radiusInner = Area(a,b,c) / halfCirc;

        return radiusInner;
    }

   public static double Bisektris1(double a, double b, double alfa){
        double p = 2 * a * b * Math.cos(alfa/2);
        double bis = p / (a + b);

        return bis;
    }

    public static double Bisektris2(double b, double c, double alfa) {
        double p = 2 * b * c * Math.cos(alfa / 2);
        double bis2 = p / (b + c);

        return bis2;
    }
    
    public static double Bisektris3(double a, double c, double alfa) {
        double p = 2 * a * c * Math.cos(alfa / 2);
        double bis3 = p / (a + c);

        return bis3;
    }
}