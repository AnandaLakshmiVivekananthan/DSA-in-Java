package interviewquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class LongestNonRepeatingSubstring {

	public static void main(String[] args) {
		String input = "AABBCCDDEEFF";
		int start = 0, end = 0, maxlength = 0;
		int n = input.length();
		HashSet<Character> set = new HashSet<>();
		List<String> subStringList = new ArrayList<>();
		int currentMaxLength = 0;
		while (end < n) {
			if (!set.contains(input.charAt(end))) {
				set.add(input.charAt(end));
				end++;
				currentMaxLength = end - start;
				if (currentMaxLength > maxlength) {
					maxlength = currentMaxLength;
					subStringList.clear();
					subStringList.add(input.substring(start, end));
				} else if (currentMaxLength == maxlength) {
					subStringList.add(input.substring(start, end));
				}
			} else {
				set.remove(input.charAt(start));
				start++;
			}
		}
		System.out.println("longest substring:\t" + subStringList);
		System.out.println("length:\t" + maxlength);
	}

}
