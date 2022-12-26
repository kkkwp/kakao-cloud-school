package kakao.itstudy.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1986, 4, 5);
        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date); // Mon May 05 00:00:00 KST 1986

        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE a hh:mm:ss");
        System.out.println(format.format(date)); // 1986년 05월 05일 월요일 오전 12:00:00
    }
}
