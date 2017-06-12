package problem1005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yejinbiao
 * @create 2017-06-12-13:06
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer,Boolean>covered = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        sc.close();
        for (String strNum : nums.split(" ")) {
            int num = Integer.parseInt(strNum);
            covered.put(num,false);
        }
        for (int key: covered.keySet()) {
            calculateSteps(key,covered);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int key: covered.keySet()) {
            if (!covered.get(key)){
                list.add(key);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(' ');
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }

    public static void calculateSteps(int num, Map<Integer,Boolean> covered) {
        Boolean cover = covered.get(num);
        while (true) {
            if (cover != null && cover) return;
            if ((num & (num - 1)) == 0) {
                while (num > 1) {
                    num >>= 1;
                    if (covered.get(num) != null) {
                        covered.put(num,true);
                    }
                }
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
                if (covered.get(num) != null) {
                    covered.put(num,true);
                }
            } else {
                num = 3 * num + 1;
            }
        }
    }
}
