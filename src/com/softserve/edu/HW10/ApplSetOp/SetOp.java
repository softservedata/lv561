package com.softserve.edu.HW10.ApplSetOp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOp {
	public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) { // Object не відпрацював.....

		Set<Integer> result = new HashSet<>(set1);
		// result = set1; Це не вірне рішення!!!!!!!!!!!!! result ,буде посилатись на
		// set1;
		result.addAll(set2);
		/*for (Integer current : set2) {
			if (!result.add(current))
				System.out.println("Dublicate detected: element " + current + " do not united!");
		}*/
		return result;

	}

	public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

		Set<Integer> resullt = new HashSet<>();
		/*-
				if (set1.size() <= set2.size()) {
					for (Integer current : set1) {
						if (set2.contains(current)) {
							result.add(current);
						}
					}
				} else {
					for (Integer current : set2) {
						if (set1.contains(current)) {
							result.add(current);
						}
		
					}
		
				}*/
		int elm = 0;
		if (set1.size() <= set2.size()) {
			for (Iterator<Integer> it = set1.iterator(); it.hasNext();) {
				elm = it.next();
				if (set2.contains(elm)) {
					resullt.add(elm);
				}
			}
		} else {
			for (Iterator<Integer> it = set2.iterator(); it.hasNext();) {
				elm = it.next();
				if (set1.contains(elm)) {
					resullt.add(elm);

				}
			}

		}
		return resullt;

	}

}
