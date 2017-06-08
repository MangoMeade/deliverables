/**
 * Created by aibar on 5/21/2017.
 */

package com.jetBrains;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DateTimeZone;

import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

    public static void main(String[] args) {
        DateTime dt = new DateTime(DateTimeZone.UTC);
        System.out.print(dt);
    }
}