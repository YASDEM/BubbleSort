package bubblesort;

import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBetterSort() {
		BubbleSort bs = new BubbleSort();
		int[] unsorted = {0, 5, 2, 1, 8, 7};
		bs.betterSort(unsorted, false);
		assertTrue(ArrayUtils.isSorted(unsorted));
	}
	
	@Test(expected = NullPointerException.class)
	public void testBetterSortNullPointer() {
		BubbleSort bs = new BubbleSort();
		int[] unsorted = null;
		bs.betterSort(unsorted, false);
		fail("NullPointerException expected");
	}
	
	
}
