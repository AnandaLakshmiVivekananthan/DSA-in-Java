package basicpgms;

import java.util.Scanner;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class OddOrEven {
	public static void main(String[] args) {
		System.out.println("Enter n value:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}
