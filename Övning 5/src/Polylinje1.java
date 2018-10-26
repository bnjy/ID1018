import java.util.Arrays;

public class Polylinje1 {

    private Punkt[] vektorHorn;
    private String color = "svart";
    private int width = 1;


    //no-argument constructor for class Polylinje
    public Polylinje1(){
        this.vektorHorn = new Punkt[0];
    }


    //constructor for class Polylinje
    public Polylinje1 (Punkt[] horn){

       this.vektorHorn = horn;
    }

    public String toString () {

        StringBuilder utskrift = new StringBuilder();

        for (int i = 0; i < this.vektorHorn.length; i++) {

            utskrift.append("(" + vektorHorn[i].name + " " + vektorHorn[i].coorX + " " + vektorHorn[i].coorY + ")");

        }

        return utskrift.toString();
    }

    //en vektor som perkar till adressen av polylinjens hörn
    public Punkt[] getHorn(){

        return this.vektorHorn;
    }

    //
    public String getFarg(){

        String farg = this.color;

        return farg;
    }

    //
    public int getBredd(){

        int bredd = this.width;

        return bredd;
    }

    //
    public void setFarg(String color){
        this.color = color;
    }

    //
    public void setBredd(int width){
        this.width = width;
    }

    //
    public double langd(){
        double leng = 0;
        for (int i = 0; i < this.vektorHorn.length; i++)
            leng += this.vektorHorn[i].avstand(this.vektorHorn[i]);

        return leng;
    }

    //
    public void laggTill (Punkt horn){

        this.laggTill(horn);
    }


    //
    public void laggTillFramfor (Punkt horn, String hornNamn){

        this.laggTillFramfor(horn, hornNamn);
    }

    //ta bort en given punkt i vektorn
    public void taBort (Punkt hornNamn){

        this.taBort(hornNamn);

    }
}

