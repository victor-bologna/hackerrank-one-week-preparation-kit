package day.two;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultThree {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> output = new ArrayList<>();
        for(int i =0;i<100;i++){
            output.add(Collections.frequency(arr, i));
        }
        return output;
    }
}
public class CountingSort {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = IntStream.range(0, 4)
                .mapToObj(i -> ThreadLocalRandom.current().nextInt(0, 4 + 1))
                .collect(Collectors.toList());
        System.out.println(ResultThree.countingSort(Arrays.asList(0,0,0,2)));
    }
}
