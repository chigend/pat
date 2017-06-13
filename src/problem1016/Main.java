package problem1016;

/**
 * @author yejinbiao
 * @create 2017-06-13-10:00
 */

public class Main {
    public static void main(String[] args) throws Exception{
//        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//
//        String line = br.readLine();
//        br.close();
//        String[] numbers = line.split(" ");
//        long A = getNumber(numbers[0],numbers[1]);
//        long B = getNumber(numbers[2],numbers[3]);
//        System.out.print(A+B);

    }

    private static long getNumber(String A,String DA){
        int index = -1;
        long result = 0;
        int number = Integer.parseInt(DA);
        while ((index = A.indexOf(DA,index+1)) != -1) {
            result = 10 * result + number;
        }
        return result;
    }
}
