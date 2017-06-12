package problem1006;

import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-12-14:49
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hundred = num / 100;
        int tens = (num - hundred * 100)/10;
        int ge = num % 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hundred; i++){
            sb.append('B');
        }
        for (int i = 0; i < tens; i++){
            sb.append('S');
        }
        for (int i = 1; i <= ge; i++) {
            sb.append(i);
        }
        System.out.print(sb);
    }
}
