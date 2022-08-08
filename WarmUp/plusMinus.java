package WarmUp;

import java.util.List;

public class plusMinus {
    public static void plusMinus(List<Integer> arr) {
        double positive = 0, negative = 0, zero = 0;
        int arraySize = arr.size();


        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }


        System.out.println(positive / arraySize);
        System.out.println(negative / arraySize);
        System.out.println(zero / arraySize);

    }
}
