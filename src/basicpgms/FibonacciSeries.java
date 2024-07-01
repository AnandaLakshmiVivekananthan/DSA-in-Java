package basicpgms;

import java.util.Scanner;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter n value:");
		Scanner in = new Scanner(System.in);
		int a = -1, b = 1, c;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
