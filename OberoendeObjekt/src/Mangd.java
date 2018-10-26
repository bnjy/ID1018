public class Mangd {

    //instansvariabel
    int[]    e = null;

    //kontruktor
    public Mangd (int[] e){

        this.e = new int [e.length];

        for(int i = 0; i < e.length; i++){
            this.e[i] = e[i];
        }
    }

    public int antalElement ()
    {
        return e.length;
    }

    public int[] getElements(){

        int[] v = new int[e.length];
        for(int i = 0; i < e.length; i++){
            v[i] = e[i];
        }
        return v;
    }

    public boolean finnsIMangden(int el){
        boolean finns = false;

        for(int i = 0; i < e.length; i++){
            if(e[i] == el){
                finns = true;
                break;
            }
        }
        return finns;
    }

    public void laggTill(int el){
        if(!finnsIMangden(el)){

            int[]     v = new int [e.length + 1];
            for(int i = 0; i < e.length; i++)
                v[i] = e[i];
            v[e.length] = el;

            e = v;
        }
    }

    public String toString(){
        String s = "{";
        if(e.length == 0)
            s = s + "}";
        else{
            for(int i = 0; i < e.length - 1; i++)
                s = s + e[i] + ", ";
            s = s + e[e.length - 1] + "}";
        }

        return s;
    }

}
