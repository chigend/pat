package problem1002;

import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-11-14:02
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String chinese = transfer(number);
        System.out.println(chinese);
    }
    public static String transfer(String number){
        int result = 0;
        for (int i = 0; i < number.length(); i++){
            result += number.charAt(i) - '0';
        }
        String[] nums = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        StringBuilder sb = new StringBuilder();
        while (result != 0) {
            int ge = result % 10;

            sb.insert(0,nums[ge]);
            sb.insert(0,' ');
            result /= 10;
        }

        return sb.deleteCharAt(0).toString();
    }
}
