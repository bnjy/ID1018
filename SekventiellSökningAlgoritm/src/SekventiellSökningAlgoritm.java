import java.util.*;


//InsättningssorteringAlgoritm
public class SekventiellSökningAlgoritm {

    public static void main(String[] args) {

    }

    public static int sok (int[] element, int e){

        int forst = 0;
        int sist = element.length - 1;
        int aktuell = forst;

        //leta efter elementet
        while(aktuell <= sist && element[aktuell] != e)
            aktuell++;
        if(aktuell > sist)
            aktuell = -1;

        return aktuell;
    }
}
