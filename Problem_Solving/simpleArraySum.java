package Problem_Solving;

import java.util.List;


/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=false
 */


public class simpleArraySum{
    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;
        for(int i=0;i<ar.size();i++){
            sum+= ar.get(i);
        }
        return sum;
    }

}