package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ananda Lakshmi Vivekananthan
 * Problem Description:
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 */
public class RunningSumOfOndDArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter size of the array:");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements of size " + size);
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		int[] solution = runningSum(array);
		System.out.println(Arrays.toString(solution));
	}

	public static int[] runningSum(int[] nums) {
		final int len = nums.length;
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}
		return nums;
	}
}
