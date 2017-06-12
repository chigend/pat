package problem1001;

import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-11-13:54
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int steps = calculateSteps(num);
        System.out.println(steps);
    }

    public static int calculateSteps(int num) {

        if ((num & (num - 1)) == 0) {
            int count = 0;
            while (num > 1) {
                num >>= 1;
                count++;
            }
            return count;
        }
        if(num % 2 == 0) {
            return 1 + calculateSteps(num / 2);
        }else {
            return calculateSteps(3*num + 1);
        }
    }
}
