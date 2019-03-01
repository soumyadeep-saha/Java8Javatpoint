package com.soumyadeep.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerMerge {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(",");
		joiner.add("a");
		joiner.add("b");
		joiner.add("c");
		joiner.add("d");
		joiner.add("e");
		joiner.add("f");
		joiner.add("g");
		joiner.add("h");
		joiner.add("i");
		joiner.add("j");		

		System.out.println(joiner);
	}
}
