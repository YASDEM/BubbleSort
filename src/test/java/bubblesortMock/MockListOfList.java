package bubblesortMock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bubblesort.ListOfListInterface;

public class MockListOfList implements ListOfListInterface {

	public int[] numbers;
	public int size;
	public boolean discard;
	

	


	public List<int[]> sliceList(int[] numbers, int size, boolean discard) {
		
		this.numbers =  Arrays.copyOf(numbers, numbers.length); 
		this.size = size; 
		this.discard = discard; 
		
		List<int[]> list = new ArrayList<int[]>();
		
		return list;
	}
	
	
	

}
