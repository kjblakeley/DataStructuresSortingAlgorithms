package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.InsertionSortSorter;

public class EnteroSorterTesterPt2 {


	public static void main(String[]args){

		Integer[] data = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		InsertionSortSorter<Integer> sorter = new InsertionSortSorter<>();
		
		System.out.print("{");
		for(int k=0; k<data.length; k++){
			data[k] = new Integer(data[k]);

			if(k<data.length-1)
				System.out.print(data[k] + ", ");
			if(k==data.length-1)
				System.out.println(data[k] + "} : Original");
		}
		IntegerComparator1 cmp1 = new IntegerComparator1();
		sorter.sort(data, cmp1);
		System.out.print("{");
		for(int k=0; k<data.length; k++){
			data[k] = new Integer(data[k]);

			if(k<data.length-1)
				System.out.print(data[k] + ", ");
			if(k==data.length-1)
				System.out.println(data[k] + "} : Ascending");
		}
		

		IntegerComparator2 cmp2 = new IntegerComparator2();
		sorter.sort(data, cmp2);
		System.out.print("{");
		for(int k=0; k<data.length; k++){
			data[k] = new Integer(data[k]);

			if(k<data.length-1)
				System.out.print(data[k] + ", ");
			if(k==data.length-1)
				System.out.println(data[k] + "} : Descending");
		}

	}

}
