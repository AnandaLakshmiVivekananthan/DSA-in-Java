package arraysandarraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ananda Lakshmi Vivekananthan
 * <p>
 * <p>
 * Problem Description:
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 */
public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] result = intersect(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		ArrayList<Integer> array = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;

		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				array.add(nums1[i]);
				i++;
				j++;
			}
		}

		return array.stream().mapToInt(a -> a).toArray();

	}
}
