
import java.util.*;

public class DetMinstaElementet1 {

    public static void main(String[] args) {

        //en sekventiell samling element
        int[]    v = {50,28,43,543,20,4325,4295,4395,43,69,855,493,321,44,340,543};
        System.out.println(Arrays.toString(v));

        //det minsta elementet
        int     m = min(v);
        System.out.println("Det minsta elementet är: " + m);
    }

    public static int min(int[] element)
            throws IllegalArgumentException
    {
        if(element.length == 0)
            throw new IllegalArgumentException ("samlingen är tom");

        int[] sekvens = element;
        int antaletPar = 0;
        int antaletOparadeElement = 0;
        int antaletTankbaraElement = 0;
        int[] delsekvens = null;
        int i = 0;
        int j = 0;

        while (sekvens.length > 1)
        {
            //urskilj delsekvensen med de tänkbara elementen
            antaletPar = sekvens.length / 2;
            antaletOparadeElement = sekvens.length % 2;
            antaletTankbaraElement = antaletPar +
                    antaletOparadeElement;
            delsekvens = new int[antaletTankbaraElement];
            i = 0;
            j = 0;

            while (j < antaletPar)
            {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1])?
                        sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            if(antaletOparadeElement == 1)
                delsekvens[j] = sekvens[sekvens.length + 1];

            //utgå nu från delsekvensen
            sekvens = delsekvens;
        }
        //sekvens[0] är det återstående tänkbara elementet
        // - det är det minsta elementet
        return sekvens[0];
    }
}
