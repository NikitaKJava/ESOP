package at.aau.ESOP.AB9.Exercise3;

import java.util.Calendar;

/**
 * Created by Nikita on 02.06.2021 at 10:27
 */
public class Calender {
    public static void main(String[] args) {
        System.out.println(makeDate(2019, 12, 31, 23, 59, 59));
        System.out.println(makeDate(2018, 10, 30, 4, 2, 2));
        System.out.println(makeDate(2020, 3, 2, 6, 4, 50));
    }

    public static Object makeDate(int year, int month, int day, int hour, int minute, int second){

        Calendar date  = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month);
        date.set(Calendar.DATE, day);
        date.set(Calendar.HOUR_OF_DAY, hour);
        date.set(Calendar.MINUTE, minute);
        date.set(Calendar.SECOND, second);

        return date.getTime();
    }
}
