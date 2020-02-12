package bubblesort;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bubblesortMock.MockBubbleSort;
import bubblesortMock.MockListOfList;
import bubblesortMock.StubBubbleSort;
import bubblesortMock.StubListOfList;

public class SortChunkTest {

	StubBubbleSort sbs;
	StubListOfList slol;
	SortChunk sortChunk;

	@Before
	public void before() {
		sbs = new StubBubbleSort();
		slol = new StubListOfList();

		sortChunk = new SortChunk();

		sortChunk.bubbleSortInterface = sbs;
		sortChunk.listOfListInterface = slol;
	}

	@Test
	public void test() {

		int[] array = new int[] { 1, 3, 2, 4 };

		List<int[]> l = new ArrayList();
		l.add(new int[] { 1, 2 });
		l.add(new int[] { 3, 4 });

		// SortChunk sc = new SortChunk();
		List<int[]> end = sortChunk.sortSlice(array, false, 2, false);
		// assertEquals(end.size(), array.length);
		assertEquals(end.get(0)[0], array[0]);

		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.get(i).length; j++) {
				assertEquals(end.get(i)[j], l.get(i)[j]);
			}
		}
	}

	@Test
	public void stubTest() {
		MockBubbleSort mbs = new MockBubbleSort();

		sortChunk.bubbleSortInterface = mbs;

		sortChunk.sortSlice(new int[] { 1, 2, 3, 4 }, false, 2, false);
		assertArrayEquals(mbs.array, new int[] { 1, 2, 3, 4 });
		
	
	}
	
	@Test
	public void mockTest() {
		MockListOfList mlol = new MockListOfList();

		sortChunk.listOfListInterface = mlol;

		sortChunk.sortSlice(new int[] { 1, 2, 3, 4 }, false, 2, false);
		assertArrayEquals(mlol.numbers, new int[] { 1, 2, 3, 4 });
		
	
	}
	
	

}
