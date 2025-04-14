package javadsapractice.arrays;

/**
 * LeaderElements
 *
 * This program finds all the leader elements in a given integer array. A leader
 * is an element that is strictly greater than all the elements to its right.
 *
 * Example: Input: [16, 17, 4, 3, 5, 2] Output: [17, 5, 2]
 *
 * Author: Vishal Kulkarni
 */

public class LeaderElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int[] arr2 = new int[5];
		arr2 = getNumber(arr);
		System.out.print("[");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			if (i != arr2.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	private static int[] getNumber(int[] myNum) {
		int count = 0;
		int maxFromRight = myNum[myNum.length - 1];
		int[] arr = new int[myNum.length];
		arr[count++] = maxFromRight;
		for (int i = myNum.length - 2; i >= 0; i--) {
			if (myNum[i] > maxFromRight) {
				arr[count++] = myNum[i];
				maxFromRight = myNum[i];
			}
		}

		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = arr[count - i - 1];
		}

		return result;
	}

}
