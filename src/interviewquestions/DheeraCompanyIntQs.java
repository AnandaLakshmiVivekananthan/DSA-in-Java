package interviewquestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class DheeraCompanyIntQs {

	public static void main(String[] args) {
		String name = "Ananda";
		Map<Character, Long> freq = name.chars().filter(ch -> ch != ' ')
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Characters and its occurances:" + freq);

		String in = "swiss";
		System.out.println("non repeating char: " + in.chars().mapToObj(ch -> (char) ch)
				.filter(ch -> in.indexOf(ch) == in.lastIndexOf(ch))
				.findFirst().get());

	}
}
