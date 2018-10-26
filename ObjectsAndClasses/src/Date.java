public class Date {

    private int month;
    private int day;
    private int year;

    public Date (int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth (int m){
        if (m >=1 && m <= 12) {
        month = m;
        }
    }

    public int getDay(){
        return day;
    }

    public void setDay (int d){
        if (d >=1 && d <= 31){
            day = d;
        }

    }

    public int getMonth(){
        return year;
    }

    public void setMonth(int y) {
        if (y >= 1 && y <= 2017){
            year = y;
        }
    }

    public String toString(){
        String result;
        result = month + "/" + day + "/" + year;
        return result;
    }
}
