package bubblesort;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListOfListTest {
	
	int[] array;
	int splitSize;

	@Before
	public void before() {
		array = new int[]{1,2,3,4,5};
		splitSize = 2;
	}
	
	@Test
	public void falseTest() {
		ListOfList lol = new ListOfList();
		List<int[]> lists = lol.sliceList(array, splitSize, false);
		assertEquals(lists.get(0).length, 2);
		assertEquals(lists.get(1).length, 2);
		assertEquals(lists.get(2).length, 1);
		assertEquals(lists.size(), 3);
		
		//System.out.println(lists.get(2)[1]);
		
	}
	@Test
	public void trueTest() {
		ListOfList lol = new ListOfList();
		List<int[]> lists = lol.sliceList(array, splitSize, true);
		assertEquals(lists.get(0).length, 2);
		assertEquals(lists.get(1).length, 2);
		assertEquals(lists.size(), 2);
		
		
		
	}
	@Test(expected = NullPointerException.class)
	public void nullTest() {
		ListOfList lol = new ListOfList();
		List<int[]> lists = lol.sliceList(null, splitSize, true);
	}
	
	
	@Test
	public void contentTest() {
		ListOfList lol = new ListOfList();
		List<int[]> lists = lol.sliceList(array, splitSize, true);
		for(int i = 0; i < lists.size(); i++) {
			assertEquals(lists.get(i/splitSize)[i%splitSize], array[i]);
		}
		
	
	}

}
