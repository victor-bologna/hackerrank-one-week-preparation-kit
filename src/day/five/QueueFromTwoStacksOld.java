package day.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QueueFromTwoStacksOld {
    public static void main(String[] args) {
        int q, choice, value = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter query size:");
            q = Integer.parseInt(br.readLine());
            List<Integer> integerList = new ArrayList<>();
            for(int count = 0; count < q; count ++) {
                System.out.println("Enter function (1-3) and value:");

                String line = br.readLine();
                if(line.contains(" ")) {
                    String[] split = line.split(" ");
                    choice = Integer.parseInt(split[0]);
                    value = Integer.parseInt(split[1]);
                } else {
                    choice = Integer.parseInt(line);
                }

                switch (choice) {
                    case 1:
                        enqueue(integerList, value);
                        break;
                    case 2:
                        dequeue(integerList);
                        break;
                    case 3:
                        print(integerList);
                        break;
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    private static void print(List<Integer> integerList) {
        System.out.println(integerList.get(0));
    }

    private static void dequeue(List<Integer> integerList) {
        integerList.remove(0);
    }

    private static void enqueue(List<Integer> integerList, int value) {
        integerList.add(value);
    }
}
