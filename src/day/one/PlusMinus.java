package day.one;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultOne {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        long plus = arr.stream().filter(number -> number > 0).count();
        long zero = arr.stream().filter(number -> number == 0).count();
        long minus = arr.stream().filter(number -> number < 0).count();

        System.out.println((double) plus/size);
        System.out.println((double) minus/size);
        System.out.println((double) zero/size);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultOne.plusMinus(arr);

        bufferedReader.close();
    }
}
