import java.io.*;
import java.util.*;


abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book{
    String title;
    public void setTitle(String s){
        this.title = s;
    }
    public String getTitle(){
            return this.title;
        }
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        
        
    }
}
