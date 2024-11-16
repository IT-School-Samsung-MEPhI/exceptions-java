package example3;

import java.util.Arrays;

public class Example3 {
    private static final long MAX_TIME = 600L;

    public static void main(String[] args) {
        try {
            simulateLongProcess();
        } catch (LongProcessException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void simulateLongProcess() throws LongProcessException {
        long startTime = System.currentTimeMillis();
        calculatePrimes(100000000);
        long endTime = System.currentTimeMillis();
        if (endTime - startTime > MAX_TIME) {
            throw new LongProcessException();
        } else {
            System.out.println("Time taken: " + (endTime - startTime) + " ms");
        }
    }

    private static boolean[] calculatePrimes(int n) {
        boolean[] res = new boolean[n + 1];
        Arrays.fill(res, true);

        res[0] = false;
        res[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (res[i]) {
                for (int j = i * i; j < n; j += i) {
                    res[i] = false;
                }
            }
        }

        return res;
    }
}
