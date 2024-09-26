package TestNGFramework;

import java.util.TreeMap;

public class SortingElementsofMapWithLambdaEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>((e1, e2) -> {

			if (e1 < e2) {

				return +1;
			} else if (e1 > e2) {

				return -1;
			} else {

				return 0;
			}

		});

		tm.put(300, "abac");
		tm.put(900, "abac");
		tm.put(150, "abac");
		tm.put(700, "abac");
		tm.put(200, "abac");

		System.out.println("After sorting " + tm);

	}
}
