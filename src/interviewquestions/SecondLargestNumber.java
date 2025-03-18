package interviewquestions;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] nums = {2,34,12,78,90};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int num : nums){
			if(num > secondLargest){
				secondLargest = largest;
				if(num > largest){
					largest = num;
				}
			}
		}
		System.out.println("second largest:"+secondLargest);
	}

}
