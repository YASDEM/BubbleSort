package bubblesortMockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
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

		sortChunk.bubbleSortInterface = mock(BubbleSort.class);
		sortChunk.listOfListInterface = mock(ListOfList.class);
	}

	@Test
	public void test() {

		List<int[]> l = new ArrayList<int[]>();
		l.add(new int[] { 1, 2 });
		l.add(new int[] { 3, 4 });

		when(sortChunk.bubbleSortInterface.betterSort(new int[] { 1, 2, 3, 4 }, false))
				.thenReturn(new int[] { 1, 2, 3, 4 }); // stubbing

		when(sortChunk.listOfListInterface.sliceList(new int[] { 1, 2, 3, 4 }, 2, false)).thenReturn(l);

		sortChunk.sortSlice(new int[] { 1, 2, 3, 4 }, false, 2, false);
		
		assertEquals() //stub und argumentcapture with mock

		verify(sortChunk.bubbleSortInterface).betterSort(new int[] { 1, 2, 3, 4 }, false);
		// ich verifiziere ob der
		// mock so verwendet wurde
		// wie ich es spezifiziert
		// habe

		verify(sortChunk.listOfListInterface).sliceList(new int[] { 1, 2, 3, 4 }, 2, false);
	}

}
