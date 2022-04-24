import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.println(str.charAt(i));
            reversedStr.append(str.charAt(i));
        }
//        System.out.println(str);
//        System.out.println(reversedStr);
        if (str.equals(reversedStr.toString())){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}