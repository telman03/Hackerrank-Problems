package Problem_Solving;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=false
 */

public class aVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        long a = 0;
        for(int i = 0; i < ar.size(); i++){
            a += ar.get(i);
        }
        return a;
    }
}
