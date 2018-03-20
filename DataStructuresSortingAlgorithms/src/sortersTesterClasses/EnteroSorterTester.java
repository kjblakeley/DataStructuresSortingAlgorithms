package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.InsertionSortSorter;

public class EnteroSorterTester {

	
	public static void main(String[]args){
		DataGenerator generador = new DataGenerator(15);
		Integer[] data = generador.generateData();
		Entero[] testArr = new Entero[15];
		
		for(int k=0; k<15; k++){
			testArr[k] = new Entero(data[k]);
			System.out.println(data[k]);
		}
		
		InsertionSortSorter<Entero> sorter = new InsertionSortSorter<>();
		sorter.sort(testArr, null);
		
	}
}
