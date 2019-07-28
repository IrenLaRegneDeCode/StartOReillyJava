/**
 * Created by Ira on 13.07.2019.
 */
public class Calendar {
    String date = "1970.01.01";
    String time = "00:00:00.000000";
//    String fullDate = getFullDate();
//    int years = 1970;
//    int months = 1 ;
//    int days = 1;
//    int hours = 0;
//    int minutes = 0;
//    int seconds = 0;
//    int milliseconds = 0;
    String dateFormat = "yyyy.mm.dd";
    String timeFormat = "hh:mi:ss.ms";
//    String fullFormat= getFullFormat();

    Calendar(){
        date = "1970.01.01";
        time = "00:00:00.000000";
        dateFormat = "yyyy.mm.dd";
        timeFormat = "hh:mi:ss.ms";
//        fullFormat = getFullFormat();
    }

    Calendar(int year, int month){
        dateFormat = "yyyy.mm.dd";
        timeFormat = "hh:mi:ss.ms";
//        setMonths(month);
//        setYears(year);
//        date =//2000.01.21
//        fullDate = "1970.01.01 00:00:00.000000";
//        fullFormat = getFullFormat();

    }

    public String getFullFormat () {
        return dateFormat+ " " +timeFormat;
    }

    public String getFullDate () {
        return date+ " "+time;
    }

    public int getYear () {
        String str = "yyyy";
        int startInd = dateFormat.indexOf(str);
        return Integer.parseInt(date.substring(startInd,startInd+str.length()));
    }

    public int getMonth (){
        String str = "mm";
        int startInd = dateFormat.indexOf(str);
        return Integer.parseInt(date.substring(startInd,startInd+str.length()));
    }

    private void setDate(int year, int month, int day){

    }

}



