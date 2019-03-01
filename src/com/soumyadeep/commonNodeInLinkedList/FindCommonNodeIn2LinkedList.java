package com.soumyadeep.commonNodeInLinkedList;

import java.util.LinkedList;
import java.util.List;

public class FindCommonNodeIn2LinkedList {

	public static void main(String[] args) {

		List<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		List<Integer> l2 = new LinkedList<>();
		l2.add(6);
		l2.add(7);
		l2.add(8);
		l2.add(4);
		
		for(int i=0; i<l1.size(); i++) {
			if(l2.contains(l1.get(i))) {
				System.out.println("Traditional for loop common node: "+l1.get(i));
			}
		}
		
		for(Integer i : l1) {
			if(l2.contains(i)) {
				System.out.println("Enhanced for loop common node: "+i);
			}
		}
	}
}
