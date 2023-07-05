package day.three;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ResultThree {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char [] charArr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(Character c : charArr){
            int ascii = (int) c;
            if(ascii >=97 && ascii <= 122){
                ascii = ((ascii-97+k) % 26) + 97;
            }
            if(ascii >= 65 && ascii <= 90){
                ascii = ((ascii-65+k) % 26) + 65;
            }
            builder.append((char) ascii);
        }
        return builder.toString();
    }
}

public class CasearCipher {

    public static void main(String[] args) {
        System.out.println(ResultThree.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 3));
    }
}
