import java.util.*;

//F9Objectsv2.java

class F9Objectsv2 {

    public static void main(String[] args) {

    //skapa två strängar och visa dem
        String s1 = new String ("solen");
        String s2 = new String ("solen i gryningen");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println();

    //skapa en referens som för tillfället inte refererar till något objekt
    //    String s3 = null;

    //bestäm och visa motsvarande strängars längd
        int len1 = s1.length (); //den första strängens längd
        int len2 = s2.length(); //den andra strängens längd

        //int len3 = s3.length(); kommer ge ett felmeddelende iom att det är en tom sträng.

        System.out.println("längden av strängen s1: " + len1);
        System.out.println("längden av strängen s2: " + len2);
        System.out.println();

        //bestäm det tecken som finns på ett givet index
        //(index räknas från 0) i en given sträng, och visa det
        char c = s1.charAt (3);
        System.out.println("tecknet som finns på index 3 i strängen s1: " + c);

    }
}