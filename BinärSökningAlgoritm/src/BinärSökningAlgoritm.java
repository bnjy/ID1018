import java.util.*;


//InsättningssorteringAlgoritm
public class BinärSökningAlgoritm {

    public static void main(String[] args) {

    }

    public static int sok (int[] element, int e){

        int forst = 0;
        int sist = element.length - 1;
        int mitterst = 0;

        //leta efter elementet
        while(forst <= sist){

            mitterst = forst + sist / 2;
            if(e == element[mitterst])
                break;
            else if (e < element[mitterst])
                sist = mitterst - 1;
            else
                forst = mitterst + 1;
        }
        if(!(forst <= sist))
            mitterst = - 1;

        return mitterst;
    }
}
