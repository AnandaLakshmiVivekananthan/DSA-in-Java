package java8;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class PracticeJ8Problems {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 7, 8, 15, 8, 4, 98, 25, 98, 33, 65, 32, 45, 12, 34);
		System.out.println("List:" + list);

		//find max in a list
		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("max:" + max);


		//find all the even numbers in a list
		System.out.println("Even numbers:");
		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print("\t" + n));

		//find all the prime numbers in a list
		System.out.println("\nPrime numbers:");
		list.stream().filter(num -> num > 0).filter(num -> IntStream.rangeClosed(2, (int) Math.sqrt(num))
				.noneMatch(i -> num % i == 0)).forEach(n -> System.out.print("\t" + n));

		//find all the numbers starting with 1
		System.out.println("\n numbers starting with 1:");
		list.stream().map(num -> num + " ").filter(nstr -> nstr.startsWith("1")).forEach(str -> System.out.print("\t" + str));

		//ascending order
		System.out.println("\n Ascending order:");
		list.stream().sorted().forEach(n -> System.out.print("\t" + n));

		//descending order
		System.out.println("\n Descending order:");
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print("\t" + n));

		//find min
		System.out.println("\n minimum value");
		System.out.println("\t" + list.stream().sorted().findFirst().get());

		//find max
		System.out.println(" maximum value");
		System.out.println("\t" + list.stream().max(Comparator.naturalOrder()).get());

		//find all duplicate elements
		System.out.println(" Duplicate Elements:");
		Set<Integer> set = new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(n -> System.out.print("\t" + n));

		//find all distinct elements
		System.out.println("\n Distinct Elements:");
		list.stream().distinct().forEach(n -> System.out.print("\t" + n));

		//find armstrong number between 1 to 1000
		System.out.println("\n Armstrong numbers btw 1 to 1000");
		IntStream.rangeClosed(1, 1000)
				.filter(n -> n == IntStream.iterate(n, i -> i / 10)
						.takeWhile(i -> i > 0)
						.map(i -> (int) Math.pow(i % 10, String.valueOf(i).length()))
						.sum())
				.forEach(n -> System.out.print("\t" + n));

		//find the first non repeating character in a string
		System.out.println("\n First non repeating character in string:");
		String str = "GEEKSFORGEEKS";
		str.chars().mapToObj(c -> (char) c)
				.filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
				.forEach(ch -> System.out.print("\t" + ch));

	}
}
