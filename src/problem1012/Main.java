package problem1012;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-12-17:45
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strNums = line.split(" ");
        int [] nums = new int[strNums.length-1];
        for (int i = 1; i < strNums.length;i++){
            nums[i-1] = Integer.parseInt(strNums[i]);
        }
        int sumA1 = 0;
        Integer sumA2 = null;
        boolean add = true;
        int countA3 = 0;
        double sumA4 = 0;
        int countA4 = 0;
        Integer maxA5 = Integer.MIN_VALUE;
        boolean existMax = false;
        for (int i = 0; i < nums.length;i++) {
            int num = nums[i];
            int mod = num % 5;
            if (mod == 0) {
                if ((num & 1) == 0) {
                    sumA1 += num;
                }
            }else if (mod == 1) {
                if (sumA2 == null) {
                    sumA2 = num;
                    add = false;
                    continue;
                }
                if (add) {
                    sumA2 += num;
                    add = false;
                }else {
                    sumA2 -= num;
                    add = true;
                }
            }else if (mod == 2) {
                countA3++;
            }else if (mod == 3){
                countA4 ++;
                sumA4 += num;
            }else if (mod == 4){
                existMax = true;
                maxA5 = Math.max(num,maxA5);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (sumA1 == 0) sb.append('N');
        else sb.append(sumA1);
        sb.append(' ');
        if (sumA2 == null )sb.append('N');
        else sb.append(sumA2);
        sb.append(' ');
        if (countA3 == 0) sb.append('N');
        else sb.append(countA3);
        sb.append(' ');
        if (sumA4 == 0) sb.append('N');
        else sb.append(new DecimalFormat("#.0").format(sumA4/countA4));
        sb.append(' ');
        if (existMax) {
            sb.append(maxA5);
        }else sb.append('N');
        System.out.println(sb);
    }
}
