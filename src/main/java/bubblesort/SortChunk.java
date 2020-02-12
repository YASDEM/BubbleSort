package bubblesort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SortChunk {

	@Autowired
	public BubbleSortInterface bubbleSortInterface;
	@Autowired
	public ListOfListInterface listOfListInterface;

	private int[] bs(int[] arr, boolean rev) {
		return bubbleSortInterface.betterSort(arr, rev);
	}

	public List<int[]> sortSlice(int[] arr, boolean rev, int size, boolean discard) {
		return listOfListInterface.sliceList(bs(arr, rev), size, discard);
	}
	
	

}
