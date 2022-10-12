package com.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinearSearch extends LinearSearch {

	@Test
	void testlinearSearch() {
		int arr[]= {10,20,30,40};
		int key=30;
		int ind=2;
		assertEquals(ind,LinearSearch.linearSearch(arr, key));
		//assertEquals(3,LinearSearch.linearSearch(new int[]{10,20,30,60}, 60));
		//assertEquals(1,LinearSearch.linearSearch(new int[] {10,20,30,40,50},60));
		//fail("Not yet implemented");
	}
	@Test
	 void testcheck() {
		 int arr[]= {};
		 int key=10;
		 if(arr.length<1) {
			 assertThrows(IndexOutOfBoundsException.class,()->LinearSearch.linearSearch(arr,key));
		 }
	 }
	


}
