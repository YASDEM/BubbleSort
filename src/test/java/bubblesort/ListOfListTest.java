package bubblesort;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListOfListTest {
	
	int[] array;

	@Before
	public void before() {
		array = new int[]{1,2,3,4,5};
	}
	
	@Test
	public void falseTest() {
		List<int[]> lists = ListOfList.sliceList(array, 2, false);
		assertEquals(lists.get(0).length, 2);
		assertEquals(lists.get(1).length, 2);
		assertEquals(lists.get(2).length, 1);
		assertEquals(lists.size(), 3);
		
		
	}
	@Test
	public void trueTest() {
		List<int[]> lists = ListOfList.sliceList(array, 2, true);
		assertEquals(lists.get(0).length, 2);
		assertEquals(lists.get(1).length, 2);
		assertEquals(lists.size(), 2);
		
		
	}
	@Test(expected = NullPointerException.class)
	public void nullTest() {
		List<int[]> lists = ListOfList.sliceList(null, 2, true);
		
		
	}

}
