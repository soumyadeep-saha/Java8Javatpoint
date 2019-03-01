package com.soumyadeep.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForeachLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("soumyadeep1");
		list.add("soumyadeep2");
		list.add("soumyadeep3");
		list.add("soumyadeep4");
		list.add("soumyadeep5");
		list.add("soumyadeep6");
		list.add("soumyadeep7");
		list.add("soumyadeep8");
		list.add("soumyadeep9");
		list.add("soumyadeep10");
		list.add("soumyadeep11");
		
		list.forEach((n) -> System.out.println(n));
	}
}
