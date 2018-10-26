import java.util.*;

public class Polylinje {

    //instansvariabler
    private Punkt[] vektorHorn;
    private String color = "svart";
    private int width = 1;

    //KONSTRUKTOR

    //konstruktor för objekt utan argument
    public Polylinje(){
        this.vektorHorn = new Punkt[0];
    }


    //konstruktor med parameter, för objekt med argument
    public Polylinje (Punkt[] horn){
        this.vektorHorn = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++) {
            this.vektorHorn[i] = new Punkt(horn[i]);
        }
    }

    //INSTANSMETODER

    //ska returnera en String med rätt utskriftsformat
    public String toString (){

        StringBuilder utskrift = new StringBuilder();

        for(int i = 0; i < this.vektorHorn.length; i++){

            utskrift.append ("[" + vektorHorn[i].name + " " + vektorHorn[i].coorX + " " + vektorHorn[i].coorY + "]");

        }

        return utskrift.toString();
    }

    //en vektor ska skapas, som innehåller kopior av polylinjens hörn
    public Punkt[] getHorn() {

        Punkt[] u = new Punkt[this.vektorHorn.length + 1];

            for(int i = 0; i < this.vektorHorn.length; i++){
                u[i] = this.vektorHorn[i];
            }

        return u;
    }

    //hämtar polylinjens färg
    public String getFarg(){

        String farg = this.color;

        return farg;
    }

    //hämtar polylinjens bredd
    public int getBredd(){

        int bredd = this.width;

        return bredd;
    }

    //metod som sätter färg på aktuell polylinje, enligt vad som anges i parametern
    public void setFarg(String color){
        this.color = color;
    }

    //metod som sätter bredd på aktuell polylinje, enligt vad som anges i parametern
    public void setBredd(int width){
        this.width = width;
    }

    ////metod som returnerar längd på den aktuella polylinjen
    public double langd(){
        double leng = 0;
        for (int i = 0; i < this.vektorHorn.length - 1; i++)
           leng += this.vektorHorn[i].avstand(this.vektorHorn[i + 1]);

        return leng;
    }

    //metod som lägger till en polylinjen
    public void laggTill (Punkt px) {
        Punkt[] h = new Punkt[this.vektorHorn.length + 1];
        int i;
        for (i = 0; i < this.vektorHorn.length; i++)
            h[i] = this.vektorHorn[i];
        h[i] = new Punkt(px);

        this.vektorHorn = h;
    }

    //metod som lägger till en polylinje framför en annan vald polylinje enligt metodens parameter
    public void laggTillFramfor(Punkt px, String hornNamn) {
        Punkt nyPunkt = new Punkt(px);
        Punkt[] u = new Punkt[this.vektorHorn.length + 1];

        //loopa till namnet dyker upp
        int index = 0;

        for (int i = 0; i < this.vektorHorn.length; i++) {

            if (this.vektorHorn[i].name.equals(hornNamn)) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < u.length - 1; j++) {
            u[j < index ? j : j + 1] = this.vektorHorn[j];
        }

        u[index] = nyPunkt;
        this.vektorHorn = u;
    }


        //ta bort en given punkt i vektorn
    public void taBort (String hornNamn){

        //skapa en array som är en kopia av this.vektor.horn.length
        Punkt[] u = new Punkt[this.vektorHorn.length - 1];

        //loopa tills namnet dyker upp
        int index = 0;
        for (int i = 0; i < this.vektorHorn.length; i++) {
            if (this.vektorHorn[i].name.equals(hornNamn)) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < index; j++){
            u[j] = this.vektorHorn[j];
        }
        for (int j = 0; j < u.length; j++){
            u[j] = this.vektorHorn[j + 1];
        }
        this.vektorHorn = u;
    }

        //ITERATOR

    public class PolylinjeIterator {

        private int     aktuell = -1;

        public PolylinjeIterator () {
            if(Polylinje.this.vektorHorn.length > 0)
                aktuell = 0;
        }

        public boolean finnsHorn (){
            return aktuell != -1;
        }

        public void gaFram(){
            if(aktuell >= 0 &&
                aktuell < Polylinje.this.vektorHorn.length - 1)
            aktuell++;
            else
            aktuell = -1;
        }

        public Punkt horn ()
                throws java.util.NoSuchElementException
        {
            if(!this.finnsHorn())
            throw new java.util.NoSuchElementException("slut av iterationen");

            Punkt   horn = Polylinje.this.vektorHorn[aktuell];
            return horn;
        }
    }
}



