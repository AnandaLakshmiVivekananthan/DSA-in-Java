package arrays;

/**
 * @author Ananda Lakshmi Vivekananthan
 * <p>
 * Problem Description:
 * Given an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class GoodPairs {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1, 1, 3};
		System.out.println(numIdenticalPairs(nums));
	}

	public static int numIdenticalPairs(int[] nums) {
		int good = 0, n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j])
					good++;
			}
		}
		return good;
	}
}
