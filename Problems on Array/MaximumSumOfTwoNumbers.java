/*
Que. You are given an array A of N integers.
Find the maximum sum of two distinct integers in the array.
 */

package Problems_on_Array;

import java.util.Scanner;

public class MaximumSumOfTwoNumbers {
    public static void main(String[] args) {
        
    
     Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter size of array:-");
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter "+(i+1)+" Number:-");
                a[i] = scanner.nextInt();
            }

            int j=0;
            int sum=0;
            while(j<n){
            for(int i=1;i<n;i++){
                if(i>j || j>i){
                    if((a[i]+a[j])>sum){
                        sum=a[i]+a[j];
                    }
                }
            }
            j=j+1;
        }
            System.out.println("Maximum sum of two numbers in array is:- "+sum);
    
}
}


/*
 The time complexity of this program is O(n^2) because there are nested loops where the outer loop runs n times and the inner loop also runs n times, resulting in a total of n^2 iterations. 

The space complexity of this program is O(1) because the amount of extra space used is constant regardless of the input size.
 */