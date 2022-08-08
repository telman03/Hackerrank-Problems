package WarmUp;

import java.util.List;

public class birthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int x = 0;
        int y = 0;

        for(int candle : candles){
            if(candle > x){
                x = candle;
            }
        }

        for(int candle : candles){
            if(candle == x){
                y++;
            }
        }

        return y;
    }
}
