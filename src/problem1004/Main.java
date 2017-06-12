package problem1004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author yejinbiao
 * @create 2017-06-12-12:38
 */

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String highest = "";
        String lowest = "";
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String student = reader.readLine();
            String[] strs = student.split(" ");
            int score = Integer.parseInt(strs[2]);
            if (score > high) {
                high = score;
                highest = strs[0] +" "+ strs[1];
            }
            if (score < low) {
                low = score;
                lowest = strs[0] +" "+ strs[1];
            }
        }
        System.out.println(highest);
        System.out.println(lowest);

    }
}
