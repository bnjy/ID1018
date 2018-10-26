import java.util.*;

//Temperaturer.java

class Temperaturer0 {

    public static void main(String[] args) {
        System.out.println("Temperaturer\n");

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Antalet veckor: ");
        int aVeck = in.nextInt();
        System.out.print("Antalet mätningar per vecka: ");
        int matnPerVeck = in.nextInt();

        double[][] t = new double[aVeck][matnPerVeck];
        for (int vecka = 0; vecka < aVeck; vecka++) {
            System.out.println("Temperaturer - vecka " + (vecka + 1) + ":");
            for (int matning = 0; matning < matnPerVeck; matning++)
                t[vecka][matning] = in.nextDouble();
        }
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("Temperaturerna:");

        for (int vecka = 0; vecka < aVeck; vecka++) {
            for (int matning = 0; matning < matnPerVeck; matning++)
                System.out.print(t[vecka][matning] + " ");
            System.out.println();
        }
        System.out.println();

        double[] minT = new double[aVeck];
        double[] maxT = new double[aVeck];
        double[] sumT = new double[aVeck];
        double[] medelT = new double[aVeck];

        for (int vecka = 0; vecka < aVeck; vecka++) {
            minT[vecka] = t[vecka][0];
            maxT[vecka] = t[vecka][0];
            sumT[vecka] = 0;
            medelT[vecka] = 0;

            for (int matning = 0; matning < matnPerVeck; matning++) {

                if (minT[vecka] > t[vecka][matning])
                    minT[vecka] = t[vecka][matning];

                if (maxT[vecka] < t[vecka][matning])
                    maxT[vecka] = t[vecka][matning];

                sumT[vecka] = sumT[vecka] + t[vecka][matning];

                medelT[vecka] = sumT[vecka] / matnPerVeck;

            }
            System.out.println("Minsta temp vecka " + (vecka + 1) + ":");
            System.out.println(minT[vecka]);
            System.out.println();

            System.out.println("Max temp vecka " + (vecka + 1) + ":");
            System.out.println(maxT[vecka]);
            System.out.println();

            System.out.println("Medeltemperatur vecka " + (vecka + 1) + ":");
            System.out.println(medelT[vecka]);
            System.out.println();

        }

        double minTemp = minT[0];
        double maxTemp = maxT[0];
        double sumTemp = 0;
        double medelTemp = 0;
        for (int vecka = 0; vecka < aVeck; vecka++) {

            if (minT[vecka] < minTemp) {
                minTemp = minT[vecka];
            }
            if (maxT[vecka] > maxTemp){
                maxTemp = maxT[vecka];
            }

            sumTemp += sumT[vecka];
        }

         medelTemp = sumTemp / (aVeck * matnPerVeck);


            System.out.println("Minsta temp mätperiod: ");
            System.out.println(minTemp);
            System.out.println();

            System.out.println("Max temp mätperiod: ");
            System.out.println(maxTemp);
            System.out.println();

            System.out.println("Summa temp mätperiod: ");
            System.out.println(sumTemp);
            System.out.println();

            System.out.println("Medeltemperatur mätperiod: ");
            System.out.println(medelTemp);
            System.out.println();
    }
}