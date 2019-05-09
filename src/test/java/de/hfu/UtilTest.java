package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;


public class UtilTest {
	@Test
	public void testIstErstesHalbjahr() {
		assertTrue(Util.istErstesHalbjahr(1));
	}
	
}
