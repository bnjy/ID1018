import java.util.*;

public class ValjPolylinje {

    public static final Random  rand = new Random();
    public static final int ANTAL_POLYLINJER = 10;

        public static void main (String[] args){

            //skapa ett antal slumpmässiga polylinjer
            Polylinje[]     polylinjer = new Polylinje[ANTAL_POLYLINJER];
            for(int i = 0; i < ANTAL_POLYLINJER; i++){
                polylinjer[i] = slumpPolylinje();
            }

            //visa polylinjerna
            for(int i = 0; i < ANTAL_POLYLINJER; i++){
                System.out.println((i+1) + ". " + polylinjer[i] + " - Färg: " + polylinjer[i].getFarg());
            }
            System.out.println();

            //bestäm den kortaste polylinjen av de som är gula
            int minLangd = ANTAL_POLYLINJER * 10;
            Polylinje kortGulpolylinje = new Polylinje();

                for(int i = 0; i < ANTAL_POLYLINJER; i++){
                        if(polylinjer[i].getFarg().equals("gul") && polylinjer[i].langd() < minLangd) {
                            kortGulpolylinje = polylinjer[i];
                    }
                }

            //visa den valda linjen
            System.out.println("Den kortaste gula polylinjen: " + kortGulpolylinje);
        }

        public static Punkt slumpPunkt(){
            String  n = "" + (char) (65 + rand.nextInt(26));
            int     x = rand.nextInt(11);
            int     y = rand.nextInt(11);

            return new Punkt (n,x,y);
        }

        public static Polylinje slumpPolylinje(){
            //skapa en tom polylinje och lägg till
            Polylinje nyPolylinje = new Polylinje();
            int antalHorn = 2 + rand.nextInt(7);
            int antalValdaHorn = 0;
            boolean[] valdaNamn = new boolean[26];


            //ett och samma namn kan inte förekomma flera gånger
            Punkt   valdPunkt;
            char    valdChar = 0;
            int     ascii;
            while(antalValdaHorn < antalHorn){
                valdPunkt = slumpPunkt();
                valdChar = valdPunkt.name.charAt(0);
                ascii = (int) (valdChar) - 65;
                if(!valdaNamn[ascii]){
                    valdaNamn[ascii] = true;
                    nyPolylinje.laggTill(valdPunkt);
                    antalValdaHorn++;
                }
            }
            nyPolylinje.setFarg(slumpFarg());
            return nyPolylinje;
        }

        //metod som slumpmässigt väljer färger blå, röd eller gul.
        public static String slumpFarg (){
            String farg;
            int fargKod = rand.nextInt(3);
            if(fargKod == 1){
                farg = "blå";
            } else if (fargKod == 2){
                farg = "röd";
            } else {
                farg = "gul";
            }
            return farg;

        }
}
