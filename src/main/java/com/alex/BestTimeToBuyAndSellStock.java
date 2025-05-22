package com.alex;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int start = 0, end = prices.length;

        while(start != prices.length-1 && prices[start] >= prices[start+1]) start++;

        if(start == prices.length-1) return 0;

        while(end-1 != start && prices[end-2] >= prices[end-1]) end--;

        if(end-1 == start) return 0;

        int maxProfit = 0;

        if(prices[start] < prices[end-1]) maxProfit = prices[end-1] - prices[start];

        for(int i = start+1; i < end-1; i++) {
            int min = Arrays.stream(Arrays.copyOfRange(prices, start, i)).min().getAsInt();
            int max = Arrays.stream(Arrays.copyOfRange(prices, i+1, end)).max().getAsInt();

            if(min<prices[i]) maxProfit = Math.max(maxProfit, prices[i]-min);
            if(max>prices[i]) maxProfit = Math.max(maxProfit, max-prices[i]);
        }


        return maxProfit;
    }
}
