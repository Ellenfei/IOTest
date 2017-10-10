package algorithms;

public class maxprofit {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int min=prices[0],profit=0;
        for(int i=1; i<prices.length; i++) {
        	if(prices[i]<min) 
        		min = prices[i];
        	else if(prices[i]-min>profit)
        		profit = prices[i]-min;
        }
        return profit;
    }
}
