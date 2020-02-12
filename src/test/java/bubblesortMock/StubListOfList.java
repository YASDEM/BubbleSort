package bubblesortMock;

import java.util.ArrayList;
import java.util.List;

import bubblesort.ListOfListInterface;

public class StubListOfList implements ListOfListInterface{
	
	

	public List<int[]> sliceList(int[] numbers, int size, boolean discard) {
		List<int[]> l = new ArrayList();
		l.add(new int[]{1,2});
		l.add(new int[]{3,4});
		return l;
		
	}

	
}
