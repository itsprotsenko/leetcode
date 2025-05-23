package com.alex;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = 0;
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < prices[min]) {
                min = i;
            } else {
                profit = Math.max(profit, prices[i] - prices[min]);
            }
        }
        return profit;
    }
}
