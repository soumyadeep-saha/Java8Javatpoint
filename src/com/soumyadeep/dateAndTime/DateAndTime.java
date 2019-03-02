package com.soumyadeep.dateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateAndTime {

	public static void main(String[] args) {

		// The LocalDate class represents a date. There is no representation of a time
		// or time-zone.
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString()); // 2013-05-15
		System.out.println(localDate.getDayOfWeek().toString()); // WEDNESDAY
		System.out.println(localDate.getDayOfMonth()); // 15
		System.out.println(localDate.getDayOfYear()); // 135
		System.out.println(localDate.isLeapYear()); // false
		System.out.println(localDate.plusDays(12).toString()); // 2013-05-27

		// The LocalTime class represents a time. There is no representation of a date
		// or time-zone.
		// LocalTime localTime = LocalTime.now(); //toString() in format 09:57:59.744
		LocalTime localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString()); // 12:20
		System.out.println(localTime.getHour()); // 12
		System.out.println(localTime.getMinute()); // 20
		System.out.println(localTime.getSecond()); // 0
		System.out.println(localTime.MIDNIGHT); // 00:00
		System.out.println(localTime.NOON); // 12:00

		// The LocalDateTime class represents a date-time. There is no representation of
		// a time-zone.
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString()); // 2013-05-15T10:01:14.911
		System.out.println(localDateTime.getDayOfMonth()); // 15
		System.out.println(localDateTime.getHour()); // 10
		System.out.println(localDateTime.getNano()); // 911000000

		/*
		 * If you want to use the date functionality with zone information, then Lambda
		 * provide you extra 3 classes similar to above one i.e. OffsetDate, OffsetTime
		 * and OffsetDateTime. Timezone offset can be represented in “+05:30” or
		 * “Europe/Paris” formats. This is done via using another class i.e. ZoneId.
		 */
		/*
		 * OffsetDateTime offsetDateTime = OffsetDateTime.now();
		 * System.out.println(offsetDateTime.toString());
		 * //2013-05-15T10:10:37.257+05:30
		 * 
		 * offsetDateTime = OffsetDateTime.now(ZoneId.of(&quot;+05:30&quot;));
		 * System.out.println(offsetDateTime.toString());
		 * //2013-05-15T10:10:37.258+05:30
		 * 
		 * offsetDateTime = OffsetDateTime.now(ZoneId.of(&quot;-06:30&quot;));
		 * System.out.println(offsetDateTime.toString());
		 * //2013-05-14T22:10:37.258-06:30
		 * 
		 * ZonedDateTime zonedDateTime =
		 * ZonedDateTime.now(ZoneId.of(&quot;Europe/Paris&quot;));
		 * System.out.println(zonedDateTime.toString());
		 * //2013-05-15T06:45:45.290+02:00[Europe/Paris]
		 * 
		 * 
		 */

		/*
		 * For representing the specific timestamp ant any moment, the class needs to be
		 * used is Instant. The Instant class represents an instant in time to an
		 * accuracy of nanoseconds. Operations on an Instant include comparison to
		 * another Instant and adding or subtracting a duration.
		 */
		Instant instant = Instant.now();
		System.out.println(instant.toString()); // 2013-05-15T05:20:08.145Z
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:13.145Z
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:03.145Z
		System.out.println(instant.minusSeconds(10).toString()); // 2013-05-15T05:19:58.145Z

		/*
		 * Duration class is a whole new concept brought first time in java language. It
		 * represents the time difference between two time stamps.
		 */
		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString()); // PT5S

		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString()); // PT1M

		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString()); // PT10M

		duration = Duration.ofHours(2);
		System.out.println(duration.toString()); // PT2H

		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString()); // PT10M

		// To interact with human, you need to get bigger durations which are presented
		// with Period class.
		Period period = Period.ofDays(6);
		System.out.println(period.toString()); // P6D

		period = Period.ofMonths(6);
		System.out.println(period.toString()); // P6M

		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println(period.toString()); // P1M29D

	}
}
