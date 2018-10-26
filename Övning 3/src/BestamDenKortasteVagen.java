import java.util.*;

public class BestamDenKortasteVagen {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        //ange antalet zoner i Z2 och Z3
        System.out.println("Ange antalet stationer i Zone Z2 (m): ");
        int numU = in.nextInt();
        System.out.println("Ange antalet stationer i Zone Z3 (n): ");
        int numV = in.nextInt();

        System.out.println();

        System.out.println("Ange längden mellan Z1 och Z2: ");
        //sparar längderna i en array
        double[] a = new double [numU];

        //går igneom alla stationer i U
        for(int i = 0; i < numU; i++){

            System.out.println("Längd "+ (i + 1)+ ": ");

            a[i] = in.nextDouble();
        }
        System.out.println();

        System.out.println();


        System.out.println("Ange längden mellan Z2 och Z3: ");
        //sparar längderna i en array
        double[][] b = new double[numU][numV];

        //går igenom alla stationer i U
        for (int i = 0; i < numU; i++){
            //går igenom stationer i V
            for (int j = 0; j < numV; j++){
                System.out.println("Längden " + (i + 1) + "." + (j + 1) + ": ");
                b[i][j] = in.nextDouble();
            }
            System.out.println();
        }


        System.out.println();

        //ange längden mellan z3 och z4
        System.out.println("Ange längden mellan Z3 och Z4: ");
        double[] c = new double[numV];

        //går igenom alla stationer i V
        for(int i = 0; i < numV; i++){

            System.out.println("Längden " + (i + 1) + ": ");

            c[i] = in.nextDouble();
        }
        System.out.println();

        //kallar på metod för att visa längden av den kortaste sträckan
        double langdKortasteStrackan = DenKortasteVagen.langd(a,b,c);
        System.out.println("Längden av den kortaste sträckan är: " + langdKortasteStrackan);

    }
}
