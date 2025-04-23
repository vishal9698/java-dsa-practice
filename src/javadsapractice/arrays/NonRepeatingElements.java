package javadsapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * FirstNonRepeating
 *
 * This program finds the first non-repeating element in a given integer array.
 * A non-repeating element is one that appears only once in the array.
 * If all elements are repeated or the array is empty, the program returns -1.
 *
 * Example 1: Input: [9, 4, 9, 6, 7, 4] → Output: 6
 * Example 2: Input: [1, 2, 3, 2, 1, 3] → Output: -1
 *
 * Author: Vishal Kulkarni
 */

public class NonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 2, 3, 2, 1, 3};
		int num = getNonRepeatingNumber(arr);
		System.out.println("Number: "+ num);
		
	}

	private static int getNonRepeatingNumber(Integer[] nums) {
		
		List<Integer> allNumbers = Arrays.asList(nums);
		return allNumbers.stream().filter(n -> Collections.frequency(allNumbers, n) == 1).findFirst().orElse(-1);

	}
}
