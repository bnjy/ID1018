import java.util.*;

public class Punkt {

    //instansvariabler
    String name;
    int coorX;
    int coorY;

    //konstruktor för class Punkt, med tre st parametrar
    public Punkt(String name, int FirstCoorX, int FirstCoorY){

        this.name = name;
        this.coorX = FirstCoorX;
        this.coorY = FirstCoorY;
    }
    //kopieringskonstruktor. skapar en kopia av en punkt, med egna referenser till det nya objektet
    public Punkt (Punkt another){
        this.name = another.getNamn();
        this.coorX = another.getX();
        this.coorY = another.getY();
    }

    //INSTANSMETODER

    //returnerar en String med korrekt utskriftsform, ex (A 3 4)
    public String toString() {
        String s = "[" + this.name + " " + this.coorX + " " + this.coorY + "] ";

        return s;
    }

    //returnerar namn på objekt
    public String getNamn() {
        return name;
    }

    //returnerar x-koordinat på objekt
    public int getX (){
        return coorX;
    }

    //returnerar y-koordinat på objekt
    public int getY (){
        return coorY;
    }

    public void setX (int x){
        this.coorX = x;
    }

    public void setY (int y){
        this.coorY = y;
    }

    public double avstand (Punkt secCoor){
        return Math.sqrt(Math.pow(this.coorX - secCoor.coorX, 2) + (Math.pow(this.coorY - secCoor.coorY, 2)));
    }

    public boolean equals (Punkt secCoor){
        boolean equal;

        if (this.coorX == secCoor.coorX && this.coorY == secCoor.coorY){
            equal = true;
        }
        else{
            equal = false;
        }
        return equal;
    }
}
