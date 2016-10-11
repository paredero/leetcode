package leetcode.buyandsell;
/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * @author javier
 *
 */
public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices == null || prices.length<2) {
    		return 0;
    	}
    	int profit = 0;
    	int[] front = new int[prices.length];
    	int[] back = new int[prices.length];
    	computeFront(prices, front);
    	computeBack(prices, back);
        for (int i = 0; i< prices.length; i++) {
        	profit = Math.max(profit, front[i] + back[i]);
        }
        return profit;
    }
    
    public void computeFront(int[] prices, int[] front) {
    	int bought = prices[0];
    	int max = 0;
    	for (int i = 0; i<prices.length; i++) {
    		if (prices[i]>bought) {
    			max = Math.max(max, prices[i]-bought);
    		} else {
    			bought = prices[i];
    		}
    		front[i] = max;
    	}
    }
    
    public void computeBack(int[] prices, int[] back) {
    	int sell = prices[prices.length - 1];
    	int max = 0;
    	for (int i = prices.length-2; i>=0; i--) {
    		if (prices[i]<sell) {
    			max = Math.max(max, sell-prices[i]);
    		} else {
    			sell = prices[i];
    		}
    		back[i] = max;
    	}
    }
}