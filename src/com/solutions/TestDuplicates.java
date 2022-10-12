package com.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestDuplicates {

	@Test
//	void testCheckDup() {
//	     assertNotEquals(new int[]{1,2,3,0},Duplicates.CheckDup(new int[] {1,2,2,3,3}, 5));
//		//fail("Not yet implemented");
//	}
 
	void testfindMax() {
		assertEquals(50,Duplicates.findMax(new int[] {10,40,50,20}));
	}
	

}
