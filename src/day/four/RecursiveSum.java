package day.four;

class ResultTwo {

    public static int superDigit(String n, int k) {
        if(n.length() < 2) return Integer.parseInt(n);
        long value = 10;
        char[] charArray = n.toCharArray();
        while (value > 9) {
            value = 0;
            for (char c : charArray) {
                value += (c - '0');
            }
            value = value * k;
            charArray = Long.toString(value).toCharArray();
            k = 1;
        }
        return (int) value;
    }
}

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(ResultTwo.superDigit("123", 3));
    }
}
