package test;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class Offer10_2 {
    public static void main(String[] args) {
        System.out.println(Solution.numWays(7));
    }

    static class Solution {
        public static int numWays(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            int a = 1, b = 1;
            for (int i = 2; i <= n; i++) {
                b = b + a;
                a = b - a;
                b = b % 1000000007;
            }
            return b;
        }
    }
}
