import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && b > 0){
            System.out.println(a * b);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
