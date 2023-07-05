package day.four;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ResultThree {
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int queue = q.size(); queue > 0; queue --) {
            if(queue == q.get(queue - 1)) {
                continue;
            }
            if(queue == q.get(queue - 2)) {
                Collections.swap(q, queue - 1, queue - 2);
                bribes ++;
            } else if (queue == q.get(queue - 3)) {
                Collections.swap(q, queue - 3, queue - 2);
                Collections.swap(q, queue - 2, queue - 1);
                bribes += 2;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(bribes);
    }
}

public class NewYearChaos {
    public static void main(String[] args) {
        ResultThree.minimumBribes(Arrays.asList(4,1,2,3));
    }
}
