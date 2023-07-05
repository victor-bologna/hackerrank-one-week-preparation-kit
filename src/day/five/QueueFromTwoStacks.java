package day.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueFromTwoStacks {
    static class Queue {

        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int x) {
            stack1.push(x);
        }

        public void dequeue() {
            transferData();
            stack2.pop();
        }

        public int print() {
            transferData();
            return stack2.push(stack2.pop());
        }

        private void transferData() {
            if(stack2.empty()) {
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }


    public static void main(String[] args) {
        int q, choice, value = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            q = Integer.parseInt(br.readLine());
            Queue queue = new Queue();
            for(int count = 0; count < q; count ++) {
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
                        queue.enqueue(value);
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        System.out.println(queue.print());
                        break;
                }
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
