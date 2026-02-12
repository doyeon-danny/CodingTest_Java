import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> result = new ArrayList<>();

        int prev = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {

            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (day > prev) {
                if (count > 0) result.add(count);
                prev = day;
                count = 1;
            } else {
                count++;
            }
        }

        result.add(count);

        return result.stream().mapToInt(i -> i).toArray();
    }

}