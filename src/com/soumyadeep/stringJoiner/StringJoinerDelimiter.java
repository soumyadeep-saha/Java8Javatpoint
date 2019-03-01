package com.soumyadeep.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDelimiter {

	public static void main(String[] args) {

		StringJoiner joiner1 = new StringJoiner(",");
		joiner1.add("a");
		joiner1.add("b");
		joiner1.add("c");
		joiner1.add("d");
		joiner1.add("e");
		
		StringJoiner joiner2 = new StringJoiner(",");
		joiner2.add("f");
		joiner2.add("g");
		joiner2.add("h");
		joiner2.add("i");
		joiner2.add("j");	
		
		StringJoiner joinerMerge = joiner1.merge(joiner2);

		System.out.println(joinerMerge);
	}
}
