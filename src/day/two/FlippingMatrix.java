package day.two;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size() / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1)),
                        Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1)));
            }
        }
        return sum;
    }

}

public class FlippingMatrix {
    public static void main(String[] args) {
        List<List<Integer>> integerListList = new ArrayList<>();
        integerListList.add(Arrays.asList(1,2,1,4));
        integerListList.add(Arrays.asList(3,4,2,3));
        integerListList.add(Arrays.asList(3,4,6,8));
        integerListList.add(Arrays.asList(3,4,9,10));
        System.out.println(Result.flippingMatrix(integerListList));
    }
}