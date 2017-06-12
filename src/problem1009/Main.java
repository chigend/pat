package problem1009;

import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-12-15:26
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }
}
