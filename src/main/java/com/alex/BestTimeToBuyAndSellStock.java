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

        int maxProfit = 0;

        if(prices[0] < prices[prices.length-1]) maxProfit = prices[prices.length-1] - prices[0];

        for(int i = 1; i < prices.length-1; i++) {
            int min = Arrays.stream(Arrays.copyOfRange(prices, 0, i)).min().getAsInt();
            int max = Arrays.stream(Arrays.copyOfRange(prices, i+1, prices.length)).max().getAsInt();

            if(min<prices[i]) maxProfit = Math.max(maxProfit, prices[i]-min);
            if(max>prices[i]) maxProfit = Math.max(maxProfit, max-prices[i]);
        }


        return maxProfit;
    }
}
