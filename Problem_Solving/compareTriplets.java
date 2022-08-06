package Problem_Solving;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=false
 * */

import java.util.ArrayList;
import java.util.List;

public class compareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) alice++;
            if (a.get(i) < b.get(i)) bob++;
        }

        answer.add(0, alice);
        answer.add(1, bob);


        return answer;
    }
}

