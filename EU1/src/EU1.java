public class EU1 {

    //min returnerar det minsta elementet i en sekvensiell sökning
    //Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException.

    public static int min (int[] element) throws IllegalArgumentException {
        if (element.length == 0) {                                          //SAKNADE KLAMMRAR I ORIGINAL
            throw new IllegalArgumentException("tom samling");
        }                                                                   //SAKNADE KLAMMRAR I ORIGINAL

        //Hör ihop med spårutskriften: 2
        int antalVarv = 1;

        int[]   sekvens = element;
        int     antaletPar = sekvens.length / 2;
        int     antaletOparadeElement = sekvens.length % 2;
        int     antaletTankbaraElement = antaletPar + antaletOparadeElement;
        int[]   delsekvens = new int[antaletTankbaraElement];               //DENNA SAKNADES EFTER ATT LOOPEN HAR KÖRTS EN GÅNG
        int     i;
        int     j;

        while (sekvens.length > 1)
        {

            //skilj ur en delsekvens med de tänkbara elementen

            i = 0;
            j = 0;

            while (j < antaletPar) {
                delsekvens[j] = (sekvens[i] < sekvens[i + 1]) ?
                        sekvens[i] : sekvens [i + 1];
                i += 2;
                j++;
            }
            if (antaletOparadeElement == 1)
                delsekvens[j] = sekvens[sekvens.length - 1];

            //utgå nu ifrån delsekvensen

            sekvens = delsekvens;
            antaletPar = antaletTankbaraElement / 2;
            antaletOparadeElement = antaletTankbaraElement % 2;
            antaletTankbaraElement = antaletPar + antaletOparadeElement;
            delsekvens = new int [antaletTankbaraElement];                  //FÖRSTA FELET I 1). GÖR DEN OÄNDLIG. DELSEKVENS SÄTTS TILL EN NY ARRAY, HÄLFTEN SÅ STOR

            //spårutskrift 1 - för att följa sekvensen
            System.out.println(java.util.Arrays.toString (sekvens));

            //spårutskrift 2 - för att avsluta loopen i förväg
            // (för att kunna se vad som händer i början)
            if (antalVarv++ == 10)
              System.exit (0);
        }

        //sekvens[0] är det enda återstående tänkbara elementet
        // - det är det minsta elementet
        System.out.println("");
        return sekvens[0];
    }

}
