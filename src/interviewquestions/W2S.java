package interviewquestions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ananda Lakshmi Vivekananthan
 */


public class W2S {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 34, 56, 78, 97, 65, 44, 33, 22);
		List<Integer> even = list.stream().filter(n -> n / 2 == 0).toList();
		List<Integer> odd = list.stream().filter(n -> n / 2 != 0).toList();
		W2SInterface voting = age -> age > 18;
		System.out.println(voting.isEligibleForVoting(45));
	}

}

