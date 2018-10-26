import java.util.*;


//UrvalssorteringAlgoritm
public class UrvalssorteringAlgoritm {

    public static void main(String[] args) {

    }

    public static void sortera (int[] element){

        int forst = 0;
        int sist = element.length - 1;
        int minst;
        int aktuell;

        //fyll alla positioner med rätt element
        while(forst < sist){

            //välj det misnta elementet i delsekvensen [forst, sist]
            minst = forst;
            aktuell = forst + 1;
            while(aktuell <= sist){

                if(element[aktuell] < element[minst])
                    minst = aktuell;

                aktuell++;
            }

            //byt plats mellan de element som finns på positinerna minst och först
            int p = element[forst];
            element[forst] = element[minst];
            element[minst] = p;

            //uppdatera den osorterade delsekvensen
            forst++;
        }
    }
}
