package day.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        String s = "";
        Stack<StringBuilder> prev = new Stack<>();
        int q;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        try {
            q = Integer.parseInt(br.readLine());
            for (int i = 0; i < q; ++i) {
                String temp[] = br.readLine().split(" ");
                if (temp[0].equals("1")) {
                    prev.push(new StringBuilder(stringBuilder.toString()));
                    stringBuilder.append(temp[1]);
                }
                if (temp[0].equals("2")) {
                    prev.push(new StringBuilder(stringBuilder.toString()));
                    stringBuilder.delete(stringBuilder.length() - Integer.parseInt(temp[1]), stringBuilder.length());
                }
                if (temp[0].equals("3")) {
                    System.out.println(stringBuilder.charAt(Integer.parseInt(temp[1]) - 1));
                }
                if (temp[0].equals("4")) {
                    if (!prev.isEmpty()) {
                        stringBuilder = prev.pop();
                    }
                }

            }
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
