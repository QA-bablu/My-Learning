package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class ArrayListExample {

	public static void main(String[] args) {

		int positiveCount = 0;
		int size = 0;

		// declaring an array
		ArrayList<Double> list = new ArrayList<Double>();

		//fill the arraylist
		
		for(int i=0;i<10;i++)
		{
			double d = new Random().nextGaussian();
			list.add(d);
		}
	//show the collection
		System.out.println("The collection is");
		
			for(Double d:list)
			{
				System.out.printf("%.2f",d);
			}
			
			size =list.size();
			
			//get iterator
		Iterator <Double> it = list.iterator();
		while(it.hasNext())
		{
			if(it.next()>0)
			{
				positiveCount++;
			}
			else
			{
				it.remove();
			}
		}
		System.out.printf("%n Numbers that > 0 (count) : %d", positiveCount);
		System.out.printf("%n Numbers that < 0 (count) : %d", size-positiveCount);
		
		System.out.println("\nThe updated collection is:");
		for(Double d:list)
		{
			System.out.printf("%.2f",d);
		}
		
	}
}