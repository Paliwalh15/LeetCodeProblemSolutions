package leetcode_30days_challenge_2020;

public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		int prev_sum = Integer.MIN_VALUE;
		int curr_sum = 0;
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			curr_sum += nums[i];
			if (prev_sum < curr_sum) {
				prev_sum = curr_sum;
			}
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}

		return prev_sum;
	}

	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
}
