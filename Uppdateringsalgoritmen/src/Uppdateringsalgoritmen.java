import java.util.*;


//DetMinstaElementet
public class Uppdateringsalgoritmen {
    public static void main(String[] args) {

        int[] element = array();
        System.out.println(Arrays.toString(element));

        //det minsta elementet
        int m = min (element);
        System.out.println("Det minsta elementet är: " + m);
    }

    public static int fillWithRandom(){
        Random  rand = new Random();

        int randomNum = rand.nextInt(99);

        return randomNum;
    }

    public static int[] array () {
        int[] element = new int[100];

        for(int i = 0; i < element.length; i++){
            element[i] = fillWithRandom();
        }
        return element;
    }

    //metoden min returnerar det minsta elementet i en array. Om samlingen är tom kastas ett undantag av
    // typen IllegalArgumentException
    public static int min (int[] element)
                            throws IllegalArgumentException
    {
        if(element.length == 0)
            throw new IllegalArgumentException ("tom samling");

        //det minsta värdet
        int m = element[0];

        //gå igenom resten av sekvensen och uppdatera det
        //aktualla minsta elementet varje gång ett ännu mindre element påträffas
        for(int i = 0; i < element.length; i++){

            if(element[i] < m){
                m = element[i];
            }
        }
        return m;
    }
}
