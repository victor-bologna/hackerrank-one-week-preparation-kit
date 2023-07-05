package day.three;

class ResultTest {

    public static int palindromeIndex(String s) {
        if(s == null || s.length() < 2) return -1;
        char[] charArray = s.toCharArray();
        int initial = 0, last = charArray.length - 1;
        if(isPalindrome(charArray, initial, last)) return -1;
        while (initial < last) {
            if(charArray[initial] != charArray[last]) {
                if(isPalindrome(charArray, initial + 1, last)) return initial;
                if(isPalindrome(charArray, initial, last -1)) return last;
            }
            initial++;
            last--;
        }
        return -1;
    }

    private static boolean isPalindrome(char[] charArray, int initial, int last) {
        if(charArray == null || initial > last) return false;
        while (initial < last) {
            if(charArray[initial] != charArray[last]) return false;
            initial++;
            last--;
        }
        return true;
    }
}

public class PalindromeIndex {
    public static void main(String[] args) {
        System.out.println(ResultTest.palindromeIndex("adbba"));
        System.out.println(ResultTest.palindromeIndex("abba"));
        System.out.println(ResultTest.palindromeIndex("zabba"));
        System.out.println(ResultTest.palindromeIndex("abtba"));
        System.out.println(ResultTest.palindromeIndex("somavamos"));
        System.out.println(ResultTest.palindromeIndex("somtavamos"));
    }
}
