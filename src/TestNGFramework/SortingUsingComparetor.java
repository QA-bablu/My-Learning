package TestNGFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingComparetor {

	public static void main(String[] args) {

		ArrayList<Integer> li = new ArrayList<>();

		li.add(200);
		li.add(900);
		li.add(700);
		li.add(100);

		System.out.println("Before Sorting " + li);
		Collections.sort(li); //default descending order
		System.out.println("After Sorting " + li);
		
		//customized sorting
		
		Collections.sort(li, (e1,e2)->{
			
			if(e1<e2) {
				return +1;
			}else if(e1>e2) {
				return -1;
			}else {
				return 0;
			}
			});
		
		System.out.println("Customized sorting "+li);
		
		
	}

}
