package problem1011;

import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-12-15:34
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            String line = sc.nextLine();
            String[] nums = line.split(" ");
            long A = Long.valueOf(nums[0]);
            long B = Long.valueOf(nums[1]);
            long C = Long.valueOf(nums[2]);
            sb.append("Case #").append(i).append(": ");
            boolean large = A > C - B;
            sb.append(large).append("\n");
        }
        sc.close();
        System.out.print(sb);
    }
}
