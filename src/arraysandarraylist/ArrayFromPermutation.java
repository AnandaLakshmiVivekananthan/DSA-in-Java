package arraysandarraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ananda Lakshmi Vivekananthan
 * Problem Description:
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
 * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
public class ArrayFromPermutation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter size of the array:");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements of size " + size);
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		int[] solution = buildArray(array);
		System.out.println(Arrays.toString(solution));
	}

	public static int[] buildArray(int[] num) {
		final int size = num.length;
		final int[] temp = new int[size];
		for (int i = 0; i < size; i++) {
			temp[i] = num[num[i]];
		}
		return temp;
	}
}
