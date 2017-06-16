package com.jetBrains;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startYear = 0;
        int startMonth = 0;
        int startDay = 0;
        int endYear = 0;
        int endMonth = 0;
        int endDay = 0;

        System.out.println("Write two dates to calculate their difference in years, months and days. Format(startYear, startMonth, startDay, endYear,endMonth, endDay)");
        startYear = scnr.nextInt();
        startMonth = scnr.nextInt();
        startDay = scnr.nextInt();
        endYear = scnr.nextInt();
        endMonth = scnr.nextInt();
        endDay = scnr.nextInt();
        
        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay); //stores startDate values
        LocalDate endDate = LocalDate.of(endYear, endMonth, endDay); //stores endDate values
        
        Period dateDifference = Period.between(startDate, endDate); //calculate date difference

        if (dateDifference.getYears() < 0) { //if the year value of startDate is higher thatn the year value of endDate run this
            System.out.println("endYear variable has to be higher than startYear variable");
        }
        else {
            System.out.println("Date difference is: " + dateDifference.getYears() + "/" + dateDifference.getMonths() + "/" + dateDifference.getDays() + " in Years/Months/Days");
        }
    }
}
