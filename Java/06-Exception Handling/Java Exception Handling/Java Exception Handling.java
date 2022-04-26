import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                if (n < 0 || p < 0){
                    throw new Exception("n or p should not be negative.");
                }
                if (n == 0 && p == 0){
                    throw new Exception("n and p should not be zero.");
                }
                int sum = 1;
                for (int i = 0; i < p; i++) {
                    sum *= n;
                }
                System.out.println(sum);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}