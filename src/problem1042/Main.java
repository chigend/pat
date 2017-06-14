package problem1042;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author yejinbiao
 * @create 2017-06-14-13:26
 */

public class Main {
    public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                br.close();
                int [] alphabet = new int[26];
                int max = 0;
                Character maxChar = null;
                char[] chs = line.toCharArray();
                for (int i = 0; i < line.length(); i++) {
                    char c = chs[i];
                    if (Character.isLetter(c)){
                        c = Character.toLowerCase(c);
                        if(++alphabet[c - 'a'] > max){
                            max = alphabet[c - 'a'];
                            maxChar = c;
                        }else if (alphabet[c - 'a'] == max){
                            if (c < maxChar) maxChar = c;
                        }
                    }
                }
                System.out.print(maxChar + " " + max);

    }
}
