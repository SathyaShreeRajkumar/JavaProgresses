package com.solutions;

import java.util.*;

public class BubbleSort {
   public static List<Integer> bubblesort(List<Integer> l) {
		if (l.size() < 1) {
			throw new IndexOutOfBoundsException("Exception");
		}
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < l.size() - 1; i++) {

				if (l.get(i) > (l.get(i + 1))) {
					int temp = l.get(i);
					l.set(i, l.get(i + 1));
					l.set(i + 1, temp);
					flag = true;
				}
			}
		}
		return l;

	}

}
