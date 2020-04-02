package com.ldgroup.ldmall.ldmallproductservice.common.utils;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeUtil {
    public static int[] splitTime(String time) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date parse = dateFormat.parse(time);
        DateTime dateTime = new DateTime(parse.getTime());
        int[] times = new int[5];
        times[0] = dateTime.getYear();
        times[1] = dateTime.getMonthOfYear();
        times[2] = dateTime.getDayOfMonth();
        times[3] = dateTime.getHourOfDay();
        times[4] = dateTime.getMinuteOfHour();
        return times;
    }
}
