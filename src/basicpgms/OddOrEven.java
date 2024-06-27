package basicpgms;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class OddOrEven {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}
