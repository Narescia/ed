package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void testIndexOf() {
		assertEquals(0, Vector.indexOf(new int[]{32, 15,7,9,12},32));
		assertEquals(2, Vector.indexOf(new int[]{32, 15,7,9,12},7));
		assertEquals(3, Vector.indexOf(new int[]{32, 15,7,9,12},9));
		assertEquals(4, Vector.indexOf(new int[]{32, 15,7,9,12},12));
		assertEquals(-1, Vector.indexOf(new int[]{32, 15,7,9,12},99));


	}
	@Test
	public void indexOfEmpty(){
		assertEquals(-1, Vector.indexOf(new int[]{},123));
	}
	@Test
	public void min(){
		assertEquals(7, Vector.min(new int[]{32, 15, 7, 9, 12}));
		assertEquals(4, Vector.min(new int[]{32, 15, 7, 9, 4}));
		assertEquals(5, Vector.min(new int[]{5, 15, 7, 9, 12}));
		assertEquals(1, Vector.min(new int[]{32, 1, 7, 9, 12}));
	}
	@Test
	public void selectionSort(){
		int[] v = new int[]{32, 15, 7, 9, 12};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7,9,12,15,32}, v);
	}

}
