import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            try {
                arr.add(s.substring(i, i+k));
            }catch (Exception e){

            }

        }
        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
    }
}