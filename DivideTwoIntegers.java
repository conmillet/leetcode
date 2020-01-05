package leetcode;

public class DivideTwoIntegers {
    public int divide (int dividend, int divisor) {
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        if (ldividend < ldivisor || ldivisor == 0) return 0;
        long lres = divide(ldividend, ldivisor);
        int res = 0;
        if (lres > Integer.MAX_VALUE) {
            res = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            res = (int) (sign * lres);
        }
        return res;
    }

    private long divide (long ldivident, long ldivisor) {
        if (ldivident < ldivisor) return 0;
        long sum = ldivisor;
        long multiple = 1;
        while ((sum + sum) <= ldivident) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + divide(ldivident - sum, ldivisor);
    }
}
