/*

import java.io.PrintWriter;
import java.util.*;

public class PunktTest {

        //public static void main (String[] args){
        PrintWriter out = new PrintWriter(System.out, true);

        // testa en konstruktor och en transformator

        Punkt punktObj1 = new Punkt ("A", 3, 4);
        Punkt punktObj2 = new Punkt ("B", 5, 6);

        System.out.println(punktObj1 + " " + punktObj2);

        //testa inspektorer - returnerar det aktuella objektets egenskaper

        String n = punktObj1.getNamn();
        int x = punktObj1.getX();
        int y = punktObj1.getY();
        System.out.println(n + " " + x + " " + y);

        //testa en kombinator och en komparator
        //en kombinator kombinerar ett antal instansmetoder för det aktuella objektet, och producerar ett resultat
        //komparatorer jämför objekt i den aktuella klassen

        double d = punktObj1.avstand (punktObj2);
        System.out.println(d);
        boolean b = punktObj1.equals (punktObj2);
        System.out.println(b);

        //testa mutatorer - ändrar utseendet av aktuella objektet

        punktObj2.setX (1);
        punktObj2.setY (2);
        System.out.println(punktObj2);

        //testa en konstruktor till

        Punkt   p = new Punkt (punktObj1);
        System.out.println(p);
    }

}
*/