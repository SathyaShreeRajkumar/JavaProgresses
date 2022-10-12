package com.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestBubbleSort {

	@Test
	     public void testbubbelsort() {
               List<Integer> l=Arrays.asList(2,3,5,4);
               Collections.sort(l);
               assertEquals(l,BubbleSort.bubblesort(l));
            }
	@Test
	void testcheck() {
		List<Integer> l=new ArrayList<>();
	     if(l.size()<1)
		assertThrows(IndexOutOfBoundsException.class,()->BubbleSort.bubblesort(l));
	}
	@Test
	void testnegative() {
		List<Integer> l=Arrays.asList(-5,-2,-6,2,1);
		Collections.sort(l);
		assertEquals(l,BubbleSort.bubblesort(l));
	}
    @Test
    void testrepeat() {
    	List<Integer> l=Arrays.asList(2,3,1,2,4);
    	List<Integer> exp=Arrays.asList(1,2,2,3,4);
    	assertEquals(exp,BubbleSort.bubblesort(l));
    }
}

