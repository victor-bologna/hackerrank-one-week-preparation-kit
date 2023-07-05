package day.four;

import java.util.Arrays;
import java.util.List;

class ResultOne {
    public static String gridChallenge(List<String> grid) {
        String s = "";
        for (String f : grid){
            char[] c = f.toCharArray();
            Arrays.sort(c);
            String d = new StringBuilder(new String(c))
                    .toString();
            if(s != "" && s.compareTo(d)>=0)return "NO";
            s=d;
        }
        return "YES";
    }
}

public class GridChallenge {
    public static void main(String[] args) {
        System.out.println(ResultOne.gridChallenge(Arrays.asList("mpxz","abcd","wlmf")));
    }
}
