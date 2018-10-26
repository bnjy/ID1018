import java.util.*;


//InsättningssorteringAlgoritm
public class InsättningssorteringAlgoritm {

    public static void main(String[] args) {

    }

    public static void sortera (int[] element){

        int forst = 0;
        int sist = element.length - 1;
        int aktuell = forst + 1;
        int hal;
        int e;

        //sortera element efter element i tur och ordning
        while(aktuell <= sist){

            e = element[aktuell];
            hal = aktuell;
            //hitta platsen for det aktuella elementet
            while (hal > forst && e < element[hal - 1]){

                element[hal] = element[hal - 1];
                hal--;
            }

            // sätt in elementet i hålet
            element[hal] = e;
            //gå till nästa position
            aktuell++;
        }
    }
}
