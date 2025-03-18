package interviewquestions;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 * <p>
 * <p>
 * 1-Rewrite the following code using Java 8 Streams and Functional Programming:
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
 * List<String> result = new ArrayList<>();
 * for (String name : names) {
 * if (name.startsWith("C")) {
 * result.add(name.toUpperCase());
 * }
 * }
 * System.out.println(result);
 * <p>
 * <p>
 * 2- My name is Luxmi -> Luxmi*is*name*My
 * without built in methods
 * <p>
 * <p>
 * 3- Odd prime number without modulus operator
 */

public class Prodapt {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
		names.stream().filter(name -> name.startsWith("C")).forEach(System.out::println);

		String input = "My name is Luxmi";
		String[] inputs = input.split(" ");
		StringBuilder output = new StringBuilder();
		int len = inputs.length;
		for (int i = len - 1; i > 0; i--) {
			output.append(inputs[i]).append("*");
		}
		output.append(inputs[0]);
		System.out.println(output);

		for (int i = 1; i <= 100; i = i + 2) {
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					System.out.print(" "+i);
				}
			}
		}

	}
}


