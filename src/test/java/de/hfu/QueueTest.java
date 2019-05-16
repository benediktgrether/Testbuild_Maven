package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
	@Test
	public void testQueue(){
		Queue q = new Queue(3);
		q.enqueue(3);
		assertTrue(3 == q.dequeue());
	}
}
