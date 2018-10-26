
import java.util.*;

public class PolylinjeTest {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        Punkt p1 = new Punkt("A", 3, 4);
        Punkt p2 = new Punkt("B", 5, 6);
        Punkt p3 = new Punkt("C", 4, 1);
        Punkt p4 = new Punkt("D", 3, 7);
        Punkt p5 = new Punkt("E", 1, 4);

        //System.out.println(p1 + " " + p2 + " " + p3);

        //Skapa ett polylinje objekt
        Punkt[] obj1 = {p1,p2,p3};
        Polylinje pol1 = new Polylinje(obj1);
        System.out.println(pol1);
        System.out.println("");

        //Testa get och set Farg
        System.out.println("Färg är: " + pol1.getFarg());

        System.out.println("Välj en färg på polylinjen: ");
            String farg = reader.nextLine();
            pol1.setFarg(farg);
        System.out.println("Färg är: " + pol1.getFarg());
        System.out.println("");

        // visa polylinjens längd
        System.out.println("Polylinjens längd: " + pol1.langd());
        System.out.println("");

        //FUNGERAR INTE HÄRIFRÅN

        //lägg till en punkt i slutet av polylinjen
        System.out.println("Addera punkt D på slutet av vektorn");
        pol1.laggTill(p4);
        System.out.println(pol1);
        System.out.println("");

        //lagg till en punkt framför en vald punkt
        System.out.println("Lägger till E framför C");
        pol1.laggTillFramfor(p5,"C");
        System.out.println(pol1);
        System.out.println("");


        //ta bort en punkt
        System.out.println("nuvarande punkter i systemet: ");
        System.out.println(pol1);
        System.out.println("");
        System.out.println("Tar bort punkt A");
        pol1.taBort("A");
        System.out.println(pol1);

        System.out.println();


        System.out.println("Iterator: ");
        Polylinje.PolylinjeIterator    iterator = pol1.new PolylinjeIterator();
        while (iterator.finnsHorn()){
            System.out.println(iterator.horn());
            iterator.gaFram();
        }

    }

}
