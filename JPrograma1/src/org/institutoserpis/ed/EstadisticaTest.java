package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstadisticaTest {

	@Test
	public void testMin() {
		assertEquals(5, Estadistica.min(new int[]{40, 25, 17, 5, 70}));
	}

	@Test
	public void testMax() {
		assertEquals(70, Estadistica.max(new int[]{40, 25, 17, 5, 70}));
	}
	
	@Test
	public void testMedia() {
		assertEquals(31.4, Estadistica.media(new int[]{40, 25, 17, 5, 70}), 0.0);
	}

}
