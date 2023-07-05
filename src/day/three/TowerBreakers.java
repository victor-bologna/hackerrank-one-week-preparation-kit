package day.three;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class ResultOne {

    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int towers, int height) {
        // Write your code here
        return (towers % 2 == 0 || height == 1) ? 2 : 1;
    }
}

public class TowerBreakers {
    public static void main(String[] args) throws IOException {
        System.out.println(ResultOne.towerBreakers(5,7));
    }
}