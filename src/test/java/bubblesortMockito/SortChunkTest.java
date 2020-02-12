package bubblesortMockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import bubblesort.BubbleSort;
import bubblesort.ListOfList;
import bubblesort.ListOfListInterface;
import bubblesort.SortChunk;
import bubblesortMock.StubBubbleSort;
import bubblesortMock.StubListOfList;

public class SortChunkTest {

	SortChunk sortChunk;

	@Before
	public void before() {
		sortChunk = new SortChunk();
	}

	@Test
	public void test() {
		List<int[]> slices = new ArrayList<int[]>();
		slices.add(new int[] { 1, 2 });
		slices.add(new int[] { 3, 4 });
		
		sortChunk.bubbleSortInterface = mock(BubbleSort.class);
		sortChunk.listOfListInterface = mock(ListOfList.class);
			
		ArgumentCaptor<int[]> intArrayCaptor = ArgumentCaptor.forClass(int[].class);
		ArgumentCaptor<Boolean> booleanCaptor = ArgumentCaptor.forClass(Boolean.class);
		ArgumentCaptor<Integer> integerCaptor = ArgumentCaptor.forClass(Integer.class);

		when(sortChunk.bubbleSortInterface.betterSort(new int[] { 1, 2, 3, 4 }, false))
				.thenReturn(new int[] { 1, 2, 3, 4 });
		when(sortChunk.listOfListInterface.sliceList(new int[] { 1, 2, 3, 4 }, 2, false))
				.thenReturn(slices);

		// Execute
		List<int[]> result = sortChunk.sortSlice(new int[] { 1, 2, 3, 4 }, false, 2, false);
		
		// Verify mock behaviour
		verify(sortChunk.bubbleSortInterface).betterSort(intArrayCaptor.capture(), booleanCaptor.capture());
		verify(sortChunk.listOfListInterface).sliceList(intArrayCaptor.capture(), integerCaptor.capture(), booleanCaptor.capture());
		
		// Verify stub result
		assertEquals(result, slices);
	}

}