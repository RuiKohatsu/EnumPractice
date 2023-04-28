package EnumPractice;

import java.util.Calendar;

public class Main {

    public static void main(String[] args){
//        System.out.println(DayOfWeek.MON.getLabel());
//        System.out.println(DayOfWeek.getDayOfWeek("日曜日"));

        int year  = 2023;   // 年
        int month = 4 - 1; // 月
        int date  = 22;     // 日
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date);
//       cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        var result = DayOfWeek.getDayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(result);



    }
}
