package day.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResultFour {
    public static int truckTour(List<List<Integer>> petrolPumps) {
        int fuel;
        for (int count = 0; count < petrolPumps.size(); count ++) {
            fuel = 0;
            for (int innerCount = 0; innerCount < petrolPumps.size(); innerCount ++) {
                fuel += petrolPumps.get(innerCount).get(0);
                fuel -= petrolPumps.get(innerCount).get(1);
                if (fuel < 0) {
                    continue;
                }
                if (count == petrolPumps.size() - 1) {
                    return count + 1;
                }
            }
        }
        return 0;
    }
}

public class TruckTour {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 5);
        List<Integer> list2 = Arrays.asList(10, 3);
        List<Integer> list3 = Arrays.asList(3, 4);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        System.out.println(ResultFour.truckTour(lists));
    }
}
