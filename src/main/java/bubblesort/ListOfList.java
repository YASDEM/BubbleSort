package bubblesort;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
	public static List<int[]> sliceList(int[] numbers, int size, boolean discard){
		List<int[]> result = new ArrayList<int[]>();
		
		int numSlices = numbers.length / size + 1;
		
		outer: for (int i = 0; i < numSlices; i++) {
			int[] slice = new int[size];
			for (int j = 0; j < size; j++) {
				try {
					slice[j] = numbers[size*i+j];
				} catch (ArrayIndexOutOfBoundsException e) {
					if (discard) {
						result.add(slice);
					}
					break outer;
				}
			}
			result.add(slice);
		}
		
		return result;
	}
}
