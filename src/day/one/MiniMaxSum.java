package day.one;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultTwo {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        BigInteger min = new BigInteger(arr.get(0).toString());
        BigInteger val1 = new BigInteger(arr.get(1).toString());
        BigInteger val2 = new BigInteger(arr.get(2).toString());
        BigInteger val3 = new BigInteger(arr.get(3).toString());
        BigInteger max = new BigInteger(arr.get(4).toString());
        System.out.println(min.add(val1).add(val2).add(val3) + " " + max.add(val3).add(val2).add(val1));
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultTwo.miniMaxSum(arr);

        bufferedReader.close();
    }
}
