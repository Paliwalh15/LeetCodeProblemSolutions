package leetcode_30days_challenge_2020;

import java.util.Arrays;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int len = nums.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 0) {
				for (int j=i+1;j<len;j++) {
					if (nums[j] != 0) {
						temp=nums[j];
						nums[j]=nums[i];
						nums[i]=temp;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		moveZeroes(nums);
	}

}
