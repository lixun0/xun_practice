package practice;

public class LeftRotateString {
    public static void main(String[] args) {
        String data = "abcdef";
        String re = leftRotateString(data, 2);
        System.out.println(re);
    }
    public static String leftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (n <= 0 || n >= str.length()) {
            return str;
        }
        int begin = 0;
        int end = str.length() - 1;
        char[] letters = str.toCharArray();
        reverseString(letters, begin, n - 1);
        reverseString(letters, n, end);
        reverseString(letters, begin, end);
        return new String(letters);

    }


    public static String reverseString(char[] letters, int begin, int end) {

        if (begin >= end) {
            return null;
        }
        for (int i = begin, j = end; i < j; i++, j--) {
            char tmp = letters[i];
            letters[i] = letters[j];
            letters[j] = tmp;
        }
        return new String(letters);
    }
}



