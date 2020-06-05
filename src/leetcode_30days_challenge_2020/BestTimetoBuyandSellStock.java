package leetcode_30days_challenge_2020;

public class BestTimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
		int len = prices.length;
		int profit = 0;
		for (int i=1;i<len;i++) {
			if (prices[i] > prices[i-1]) {
				profit += prices[i]-prices[i-1];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int nums[] = { 7,6,4,3,1};
		System.out.println(maxProfit(nums));
	}

}
