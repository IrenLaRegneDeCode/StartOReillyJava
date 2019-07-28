/**
 * Created by Ira on 03.07.2019.
 */
//import

public class Main {


    public static void main(String[] args) {
        Calendar myTestCalendar=new Calendar (1328, 16);


//        System.out.println(myTestCalendar.fullDate);
//        System.out.println(myTestCalendar.fullFormat);
        System.out.println(myTestCalendar.getYear());
        System.out.println(myTestCalendar.getFullDate());


        double xx = 366.;
        int yy = 2007;

        String x = getMonthByDayOfYear(xx, yy);
        System.out.println("1) "+x);

        System.out.println("2) "+getMonthByDayOfYearLeap(2));

        System.out.println();
        System.out.println(getMonthByDayOfYearNotLeap(2));
        System.out.println("3) "+getMonthByDayOfYearNotLeap(35));
        System.out.println("4) "+getMonthByDayOfYear(654, 2003));
        System.out.println("from my method: "+getMonthByDayOfYearNotLeap(23));
        System.out.println("5) "+getMonthByDayOfYearLeap(222));
        System.out.println("6) "+getMonthByDayOfYearNotLeap(333));






//        System.out.println(Math.pow(2,32-1));

//        for (byte i = 126; i!=125; i++) {
//            System.out.println("i="+i+" "+"LOL");
//        }
    }

    private static String getMonthByDayOfYearNotLeap(double dayOfYear) {
        return getMonthByDayOfYear(dayOfYear,1);
    }

    private static String getMonthByDayOfYearLeap(double dayOfYear) {
        return getMonthByDayOfYear(dayOfYear,4);
    }


    private static String getMonthByDayOfYear(double dayOfYear, int year) {
        int dayLeapYear;
        if (year %4 == 0){
            dayLeapYear = 1;
        } else {
            dayLeapYear = 0;
        }

        if (dayOfYear <= 0){
            return "число не может быть меньше единицы";
        } else if (dayOfYear <= 31){
            return "Сейчас январь";
        } else if (dayOfYear <= 59 + dayLeapYear){
            return "Сейчас февраль";
        } else if (dayOfYear <= 90 + dayLeapYear) {
            return "Сейчас март";
        } else if (dayOfYear <= 120 + dayLeapYear) {
            return "Сейчас апрель";
        } else if (dayOfYear <= 151 + dayLeapYear) {
            return "Сейчас май";
        }else if (dayOfYear <= 181 + dayLeapYear) {
            return "Сейчас июнь";
        }else if (dayOfYear <= 212 + dayLeapYear) {
            return "Сейчас июль";
        }else if (dayOfYear <= 243 + dayLeapYear) {
            return "Сейчас август";
        }else if (dayOfYear <= 273 + dayLeapYear) {
            return "Сейчас сентябрь";
        }else if (dayOfYear <= 304 + dayLeapYear) {
            return "Сейчас октябрь";
        }else if (dayOfYear <= 334 + dayLeapYear) {
            return "Сейчас ноябрь";
        }else if (dayOfYear <= 365 + dayLeapYear) {
            return "Сейчас декабрь";
        } else {
            return "число не в диапазоне";
        }
    }
}





















//            System.out.println("Hello world! " + " i=i+1; " + i);
//            i=i+1;
//            System.out.println("Hello world! " + " i+=1; " + i);
//            i+=1;
//            System.out.println("Hello world! " + " i++; " + i);
//            i++;
//            KonfetiX = KonfetiX - i*3;
//                    System.out.println("Konfet: " + KonfetiX);
//                    if (KonfetiX<0)
//        {
//        if (KonfetiX>0) {
//        System.out.println(KonfetiX+">0 Больше нет (для этих детей)! Но мне остались =)");
//        }
//        else {
//        System.out.println(KonfetiX+ " Больше нет! И мне не осталось =(");
//        }
//        break;
//        }
//        else if (KonfetiX<10) {
//        System.out.println("Конфет стало меньше!!!!");
//
//        }
