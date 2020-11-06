package com.example.JavaProblems;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateTime {
	     public static void main(String [] args) {
	         Period period = Period.of(1, 1, 1);
	         System.out.println(period);
	     }
	}

 class LocalDateMINMAx {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}

	