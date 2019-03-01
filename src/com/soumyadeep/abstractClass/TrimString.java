package com.soumyadeep.abstractClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrimString {

	public void trimString(String stringToTrim) {


		String regex = "[A-Za-z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(stringToTrim);
		char[] ch = stringToTrim.toCharArray();
		char[] newCh = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				break;
			}
			
			//String str = new String(ch[i]);
		}

		for (int element : newCh) {
			System.out.println(element);
		}
		
/*		String regex = "[A-Za-z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(stringToTrim);
		List<Integer> minStart = new ArrayList<>();
		List<Integer> maxEnd = new ArrayList<>();
		while(matcher.find()) {
		    minStart.add(matcher.start());
		    maxEnd.add(matcher.end());
		}
		int start = minStart.get(0);
		int end = maxEnd.get(maxEnd.size()-1);
		String result = stringToTrim.substring(start, end);
		System.out.println(result);*/
	}

	public static void main(String[] args) {

		TrimString obj = new TrimString();
		obj.trimString("     afhsa  ghjsa  ");
	}

}
