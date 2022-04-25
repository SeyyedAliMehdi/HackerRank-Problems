import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
        String regularExpression = "^[A-Za-z]\\w{7,29}$";;
          Scanner scan = new Scanner(System.in);
          int n = Integer.parseInt(scan.nextLine());
          while (n-- != 0) {
              String userName = scan.nextLine();

              if (userName.matches(regularExpression)) {
                  System.out.println("Valid");
              } else {
                  System.out.println("Invalid");
          }
        }
    }
}