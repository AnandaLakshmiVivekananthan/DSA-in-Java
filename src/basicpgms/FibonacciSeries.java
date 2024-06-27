package basicpgms;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = -1, b = 1, c;
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
