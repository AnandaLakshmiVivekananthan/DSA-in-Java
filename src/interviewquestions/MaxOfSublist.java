package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class MaxOfSublist {
	public static void main(String[] args) {
		List<Integer> candidates = new ArrayList<>();
		candidates.add(2);
		candidates.add(3);
		candidates.add(5);
		candidates.add(8);
		candidates.add(2);
		candidates.add(1);
		candidates.add(3);
		candidates.add(9);
		int group = 3;
		System.out.println(maxOfCandidateGroup(candidates, group));
	}

	private static List<Integer> maxOfCandidateGroup(List<Integer> candidates, int group) {
		List<Integer> sublist = new ArrayList<>();
		List<Integer> max = new ArrayList<>();
		int i = 0, j = group;
		while (i < candidates.size() && j < candidates.size()) {
			for (int k = i; k < j; k++) {
				sublist.add(candidates.get(k));
			}
			max.add(Collections.max(sublist));
			sublist.clear();
			i++;
			j++;
		}
		return max;
	}
}
