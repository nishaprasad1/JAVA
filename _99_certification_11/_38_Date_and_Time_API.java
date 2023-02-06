package _99_certification_11;
import java.time.*;
import java.time.format.DateTimeFormatter;
/*
Date ant Time API:
-->1.8V, Joda TimeAPI
--> joda.org
--> java.time package

Q. Program to print system date and time?
LocalDate===> Date
LocalTime===> Time

import java.time.*;
class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
o/p:
2022-02-16
03:44:57.744205700
----

Q. format the date as dd-mm-yyyy
import java.time.*;
class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd= date.getDayOfMonth();
		int mm= date.getMonthValue();
		int yyyy= date.getYear();
		System.out.println(dd+"-"+mm+"-"+yyyy);
	}
}
o/p:
2022-02-16
16-2-2022

Q. formated time
import java.time.*;
class Test{
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
	}
}
-----

--> if we want both date and time 
LocalDateTime

import java.time.*;
class Test{
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}
o/p:
2022-02-16T03:58:34.215408800
---

--> we can represent a particular Date and time by using LocalDateTime object.

import java.time.*;
class Test{
	public static void main(String[] args) {
		//                                  yyyy        mm     dd hh mm    
		LocalDateTime dt = LocalDateTime.of(1995, Month.AUGUST,23,12,45);
		System.out.println(dt);//1995-08-23T12:45
		System.out.println("after 6 months "+ dt.plusMonths(6));//after 6 months 1996-02-23T12:45
		System.out.println("before 6 months "+ dt.minusMonths(6));//before 6 months 1995-02-23T12:45
	}
}
===========

To Represent Zone:
ZoneId object can be used to represent zone.

import java.time.*;
class Test{
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);//  Asia/Calcutta
	}
}
--
--> to use particular zone and its date time:

import java.time.*;
class Test{
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		System.out.println(zone);// America/Los_Angeles
		
		ZonedDateTime zt= ZonedDateTime.now(zone);
		System.out.println(zt);// 2022-02-15T15:03:13.251292-08:00[America/Los_Angeles]
	}
}
===============

Period:
--> period object can be used to represent quantity of time.

class Test{
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birtday= LocalDate.of(1995, 8, 23);
		Period p = Period.between(birtday, today);
		System.out.printf("Your age is %d years %d months %d days", 
				p.getYears(), p.getMonths(), p.getDays());
//Your age is 26 years 5 months 24 days		
	}
}
---

Q.
import java.time.*; 
class Test{
	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d is leap year",n);
		}else
			System.out.printf("%d is not leap year",n);
	}
}
o/p: 2022 is not leap year
---------

LocalDate date = LocalDate.of(yyyy, mm, dd);
we have to pass only allowed values for month, day and year.

Q. which of the following are valid?
A) LocalDate date = LocalDate.of(2020, 01, 32); 
B) LocalDate date = LocalDate.of(2020, 15, 25); 
C) LocalDate date = LocalDate.of(2020, 01, 25);
D) NOT

answer: C

======================

LocalDate class parse methods:
--> LocalDate class contains the following 2 parse methods:

 1. public static LocalDate parse(CharSequence txt);
 Internally it is parsed by using "DateTimeFormatter.ISO_LOCAL_DATE"
 It will throw DateTimeParseException if the txt is not proper.
 
 2. public static LocalDate parse(CharSequence txt, DateTimeFormatter formatter);
 
  LocalDate class format() method:
  parse()=========> String to LocalDate
  format()========> LocalDate to String
  
  public String format(DateTimeFormatter formatter);

---
Q.
import java.time.*;
import java.time.format.DateTimeFormatter;
class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 01, 25);
		String txt = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println(txt);
	}
}
o/p: 2020-01-25
---

Q.
import java.time.*;
import java.time.format.DateTimeFormatter;
class Test{
	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.of(2020, 01, 25, 11, 23, 45);
		String txt = dt.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(txt);
	}
}
o/p: 2020-01-25T11:23:45
---
Q.
import java.time.*;
import java.time.format.DateTimeFormatter;
class Test{
	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.of(2020, 01, 25, 11, 23, 45);
		String txt = dt.format(DateTimeFormatter.ISO_DATE);
		System.out.println(txt);
	}
}
---

1. If we have only Date then we should use only Date related formatter but not
datetime related formatter.
2. If we have both date and time, then we can use either Date related formatter or
Datetime related formatter.

---

class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2020-01-25");
		System.out.println(date.getDayOfMonth()+"/"+date.getMonth()+"/"+date.getYear());
	}
}
o/p: 25/JANUARY/2020
---

class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2020-01-25");
		String txt = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println(txt);
	}
}
o/p:2020-01-25
---

Q.
class Test{
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2020-01-25");
		String txt = date.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(txt);
	}
}
RE: Unsupported field: HourOfDay
---

Q. Assume today date is 2020-01-25. Which of the following is valid way of creating LocalDate
object to represent current date?
A) LocalDate dt1 = LocalDate.now();
B) Localdate dt2 = LocalDate.of(2020,01,25);
C) LocalDate dt3 = LocalDate.parse("2020-01-25", DateTimeFormatter.ISO_DATE); 
D) LocalDate dt4 = LocalDate.parse("2020-01-25", DateTimeFormatter.ISO_DATE_TIME);

answer: A,B,C
---

Q.
class Test{
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		dt.plusDays(10);
		dt.minusMonths(3);
		String txt = dt.format(DateTimeFormatter.ISO_DATE);
		System.out.println(txt);
	}
}
o/p:2022-02-16 (that days current date)

Note: LocalDate, LocalTime, LocalDateTime are immutable objects. ie, once we create 
an object, we cannot change content in the existing object. If we are trying to change
the content, with those changes a new object will be created.
---

Q. assume today is 2022-02-16
class Test{
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dt1 = dt.plusDays(10);
		LocalDateTime dt2 =dt1.minusMonths(3);
		String txt = dt2.format(DateTimeFormatter.ISO_DATE);
		System.out.println(txt);
	}
}
o/p: 2021-11-26
 */

public class _38_Date_and_Time_API {public static void main(String[] args) {}}