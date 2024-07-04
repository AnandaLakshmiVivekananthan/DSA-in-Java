package arraysandarraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ananda Lakshmi Vivekananthan
 * Problem Description:
 * Given an integer array nums of length n, you want to create an array ans of length 2n where
 * ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 */
public class ConcatenationOfArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter size of the array:");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements of size " + size);
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		int[] solution = getConcatenation(array);
		System.out.println(Arrays.toString(solution));
	}

	private static int[] getConcatenation(int[] nums) {
		final int size = nums.length;
		final int[] solution = new int[2 * size];
		for (int i = 0; i < size; i++) {
			solution[i] = nums[i];
			solution[i + size] = nums[i];
		}
		return solution;
	}
}
