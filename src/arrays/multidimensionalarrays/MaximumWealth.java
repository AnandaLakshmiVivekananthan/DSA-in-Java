package arrays.multidimensionalarrays;

/**
 * @author Ananda Lakshmi Vivekananthan
 * <p>
 * Problem Description:
 * You are given an m x n integer grid accounts where accounts[i][j]
 * is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class MaximumWealth {

	public static void main(String[] args) {
		int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
		int wealth = maximumWealth(accounts);
		System.out.println("wealth: " + wealth);

	}

	public static int maximumWealth(int[][] accounts) {
		int max = 0, sum = 0;
		for (int[] a : accounts) {
			sum = 0;
			for (int i = 0; i < a.length; i++)
				sum += a[i];
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
