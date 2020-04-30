package leetcode_30days_challenge_2020;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
    public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(n);
		while (true) {
			if (n == 1) {
				return true;
		}
			n = sumDigitSquare(n);
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
		}
        
    }
    
    	public static int sumDigitSquare(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + (int) Math.pow(n % 10, 2);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(isHappy(7));
	}

}
