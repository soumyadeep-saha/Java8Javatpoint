package com.soumyadeep.parseStringToDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseStringToDate {

	public static void main(String[] args) {

		//Convert string to date in ISO8601 format
		String armisticeDate = "2019-04-04";
		LocalDate aLD = LocalDate.parse(armisticeDate);
		System.out.println("Date: " + aLD);
		String armisticeDateTime = "2016-04-04T11:50";
		LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
		System.out.println("Date/Time: " + aLDT);
		
		//Convert string to date in custom formats
		String anotherDate = "04 Apr 2019";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);
		System.out.println(anotherDate + " parses as " + random);
	}
}
