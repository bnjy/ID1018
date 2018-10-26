
import java.util.*;

public class DetMinstaElementet2 {

    public static void main(String[] args) {

        int [] v = {14,43,5,11,6};

        System.out.println(Arrays.toString(v));

        int m = min(v);
        System.out.println("Det minsta elementet är: " + m);
    }

    public static int min (int[] userInput){

        int[] sekvens = userInput;
        int antalPar = sekvens.length / 2;
        int antalOparade = sekvens.length % 2;
        int antalTankbara = antalOparade + antalPar;
        int[] delsekvens = new int [antalTankbara];

        int j = 0;
        int i = 0;

        while(antalPar >= 1) {
            i = 0;
            j = 0;
            while (j < antalPar) {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1]) ?
                        sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            System.out.println();
            System.out.println(Arrays.toString(delsekvens));
            if (antalOparade == 1)
                System.out.println("j's värde är här: " + j);
                delsekvens[j] = sekvens[2 * antalPar + antalOparade - 1];
            System.out.println("sekvens[2 * antalPar + antalOparade - 1]: " + sekvens[2 * antalPar + antalOparade - 1]);
            System.out.println("Så nu blir arrayen såhär: " + Arrays.toString(delsekvens));

            sekvens = delsekvens;
            antalPar = antalTankbara / 2;

            antalOparade = antalTankbara % 2;
            antalTankbara = antalPar + antalOparade;

        }

        return sekvens[0];
    }
}