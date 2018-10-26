import java.util.*;

public class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar {

    public static void main (String[] args){

        System.out.println("Operationer med naturliga heltal givna som teckensträngar\n");

        //mata in två naturliga heltal
        Scanner in = new Scanner(System.in);
        System.out.println("Två naturliga heltal: ");
        String num1 = in.next();
        String num2 = in.next();
        System.out.println();

        //addera heltalen och visa resultaten
        String sum = add (num1, num2);
        System.out.println("Addition: ");
        System.out.println(sum);

        //subtrahera heltalen och visa resultatet
        String diff = sub (num1, num2);
        System.out.println("Subtraktion: ");
        System.out.println(diff);



    }

    //addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras
    //summa som en teckensträng

    public static String add (String num1, String num2){
        //skriv koden här
        StringBuilder sum = new StringBuilder();
        int left = 0;

        //gör num1 och num2 till lika många tecken med hjälp av metod sameLengths
        if(num1.length() > num2.length()){
            num2 = sameLengths(num1, num2);
        } else if (num2.length() > num1.length()){
            num1 = sameLengths(num2, num1);
        }

        //addera varje int i teckensträngen för sig själv
        for(int i = num1.length() - 1; i >= 0; i--) {
            int add1 = (num1.charAt(i) - 48);
            int add2 = (num2.charAt(i) - 48);

            int partSum;

            partSum = add1 + add2 + left;
            left = partSum / 10;
            partSum = partSum % 10;

            sum.append(String.valueOf(partSum));
        }
        if(left == 1){
            sum.append(String.valueOf(left));
        }
        sum.reverse();
        return sum.toString();
    }

    //subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar
    //deras differens som en teckensträng.
    //Det första heltalet är inte mindre än det andra heltalet.

    public static String sub (String num1, String num2){
        StringBuilder diff = new StringBuilder();
        int left = 0;

        //gör num1 och num2 till lika många tecken med hjälp av metod sameLengths
        if(num1.length() > num2.length()){
            num2 = sameLengths(num1,num2);
        }
        for(int i = num1.length() - 1; i >= 0; i--)
        {
            int sub1 = (num1.charAt(i) - left - 48);
            int sub2 = (num2.charAt(i) - 48);

            int loopDiff;

            if (sub1 >= sub2){
                loopDiff = sub1 - sub2;
                left = 0;
            }
            else {
                loopDiff = (sub1 + 10) - sub2;
                left = 1;
            }
            diff.append(String.valueOf(loopDiff));
        }

        diff.reverse();

        if (diff.charAt(1) == 0){
            diff.deleteCharAt(1);
        }

        return diff.toString();
    }
    //metod för att num1 och num2 ska bli lika många tecken. Den mindre strängen får "0" framför sig till
    // strängarna är lika långa
    private static String sameLengths(String major, String minor){
        int diff = major.length() - minor.length();

        for(int i = 0; i < diff; i++){
            minor = 0 + minor;

        }
        return minor;
    }
}
