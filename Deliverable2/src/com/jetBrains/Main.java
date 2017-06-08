package com.jetBrains;

import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.Months;
import org.joda.time.Days;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startYear = 0;
        int startMonth = 0;
        int startDay = 0;
        int endYear = 0;
        int endMonth = 0;
        int endDay = 0;
        int yearDiff = 0;
        int monthDiff = 0;
        int dayDiff = 0;
        int dateDiffMonth = 0;

        System.out.println("Write two dates to calculate their difference in years, months and days. Format(startYear, startMonth, startDay, endYear,endMonth, endDay)");
        startYear = scnr.nextInt();
        startMonth = scnr.nextInt();
        startDay = scnr.nextInt();
        endYear = scnr.nextInt();
        endMonth = scnr.nextInt();
        endDay = scnr.nextInt();

        DateTime start = new DateTime().withDate(startYear, startMonth, startDay);
        DateTime end = new DateTime().withDate(endYear, endMonth, endDay);

        yearDiff = Years.yearsBetween(start.toLocalDate(), end.toLocalDate()).getYears();
        monthDiff = Months.monthsBetween(start.toLocalDate(), end.toLocalDate()).getMonths();
        dayDiff = Days.daysBetween(start.toLocalDate(), end.toLocalDate()).getDays();

        dateDiffMonth = monthDiff - (yearDiff * 12);


        System.out.println("Year difference: " + yearDiff);
        System.out.println("Month difference: " + monthDiff);
        System.out.println("Day difference: " + dayDiff);
        System.out.println("Year + Month difference: " + yearDiff + "/" + dateDiffMonth);
    }
}