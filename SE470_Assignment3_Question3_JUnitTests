// Riley Olson
// Assignment 3 Question 3
// 01/30/2023

import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest
{

/*
 *   Test case number: 1
 *   Test case values: push 1 and 2
 *   Expected output (Post-state): [1, 2]
 */
	@Test
	public void test0()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		assertEquals("[1, 2]", q.toString());
	}

/*
 *   Test case number: 2
 *   Test case values: push 1 and 2, pop 1
 *   Expected output (Post-state): [2]
 */
	@Test
	public void test1()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		assertEquals("[2]", q.toString());
	}
	
/*
 *   Test case number: 3
 *   Test case values: push three items into a queue with the size of two
 *   Expected output (Post-state): throw IllegalStateException
 */
	@Test (expected=IllegalStateException.class)
	public void test2()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		assertEquals("[2]", q.toString());
	}

/*
 *   Test case number: 4
 *   Test case values: push null
 *   Expected output (Post-state): throw NullPointerException
 */
	@Test (expected=NullPointerException.class)
	public void test3()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(null);
		assertEquals("[2]",q.toString());
	}
	
/*
 *   Test case number: 5
 *   Test case values: push 1 into a queue with 2 spaces, check if  full
 *   Expected output (Post-state): return false
 */
	@Test
	public void test4()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		assertEquals(false, q.isFull());	
	}
	
/*
 *   Test case number: 6
 *   Test case values: push 1 into a queue with size of 2, check if the queue is empty
 *   Expected output (Post-state): return false
 */	
	@Test
	public void test5()
	{
		BoundedQueue q = new BoundedQueue(2);
		q.enqueue(1);
		assertEquals(false, q.isEmpty());	
	}

	
/*
 *   Test case number: 7
 *   Test case values: initialize a new queue, check if the queue is empty
 *   Expected output (Post-state): return true, the queue is empty
 */	
	@Test
	public void test6()
	{
		BoundedQueue q = new BoundedQueue(1);
		assertEquals(true, q.isEmpty());	
	}
	
/*
 *   Test case number: 8
 *   Test case values: push 1 into queue with size of 1, check if the queue is full
 *   Expected output (Post-state): return true
 */		
	@Test
	public void test7()
	{
		BoundedQueue q = new BoundedQueue(1);
		q.enqueue(1);
		assertEquals(true, q.isFull());	
	}
	
/*
 *   Test case number: 9
 *   Test case values: initialize a queue with negative spaces
 *   Expected output (Post-state): throw IllegalArgumentException
 */	
	@Test (expected=IllegalArgumentException.class)
	public void test8()
	{
		BoundedQueue q = new BoundedQueue(-1);
		q.enqueue(1);
		assertEquals(true, q.isFull());	
	}
	

/*
 *   Test case number: 10
 *   Test case values: push 1 into a queue with the size of 1 and pop two times
 *   Expected output (Post-state): throw IllegalStateException
 */	
	@Test (expected=IllegalStateException.class)
	public void test9()
	{
		BoundedQueue q = new BoundedQueue(1);
		q.enqueue(1);
		q.dequeue();
        q.dequeue();
		assertEquals(true, q.isEmpty());
	}
}
