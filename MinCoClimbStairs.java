import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinCoClimbStairs {

    public int minCostClimbingStair(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        // int [] initial elements are 0
        // minCost[0] = 0;
        // minCost[1] = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            minCost[i] = Math.min(minCost[i - 2] + cost[i - 2], minCost[i - 1] + cost[i - 1]);
        }
        return minCost[cost.length];
    }

    public static void main(String[] args) {
        int cost[] = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        MinCoClimbStairs mccs = new MinCoClimbStairs();
        System.out.println(mccs.minCostClimbingStair(cost));
    }
}
