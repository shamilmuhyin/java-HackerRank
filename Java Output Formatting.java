import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String myString = scanner.next();
            int myInt = scanner.nextInt();      
            System.out.printf("%-15s%03d\n",myString,myInt);
        }
        System.out.println("================================");
    }
}
