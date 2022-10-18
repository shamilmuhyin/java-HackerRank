import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i =0;i<q;i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            printSeries(a,b,n);
        }
        scanner.close();
    }

    private static void printSeries(int a, int b, int n) {
        int arr[] = new int[n];
        int element = 0;
        int nthRootOfTwo = 1;
        for(int i=0;i<n;i++) {
            if(i == 0) {
                element = a+b;
            }
            else {
                nthRootOfTwo = nthRootOfTwo*2;
                element = element + nthRootOfTwo*b;
            }
            arr[i]= element;
        }
        display(arr);
        System.out.println();
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " "); 
        }
        
    }
}
