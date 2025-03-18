package java8;

import java.util.List;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class CG {
	public static void main(String[] args) {
		List<String> strings = List.of("apple", "banana", "orange", "grape", "kiwi");
		float total = 0;
		int anum = 0;
		for(String s : strings){
			total+=s.length();
			char[] arr = s.toCharArray();
			for(char a : arr){
				if(a == 'a')
					anum++;
			}
		}

//		strings.stream().filter(s-> s.contains("a")).
		float avg = total/strings.size();
		System.out.println(avg);
		System.out.println(anum);

	}
}
