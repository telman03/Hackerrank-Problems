package WarmUp;

import java.util.List;

public class min_max_Sum {
    public static void miniMaxSum(List<Integer> arr) {
        long[] n = new long[arr.size()];

        long sum = 0;
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }

        for(int i = 0; i < arr.size(); i++){
            n[i] = sum - arr.get(i);
        }

        long min = n[0];
        long max = n[0];

        for(int k = 1; k < arr.size(); k++){
            if(n[k] < min){
                min = n[k];
            }
            if(n[k] > max){
                max = n[k];
            }
        }
        System.out.print(min + " " + max);
    }

}
