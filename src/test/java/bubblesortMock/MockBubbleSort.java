package bubblesortMock;

import java.util.Arrays;

import bubblesort.BubbleSortInterface;

public class MockBubbleSort implements BubbleSortInterface {

	
	public int[] array;
	public boolean reverse;
	

	public int[] betterSort(int[] array, boolean reverse) {
		
		this.array = Arrays.copyOf(array, array.length);
		this.reverse = reverse;
		return new int[] {1,2,3,4};
		}
	
	
	
	
}
