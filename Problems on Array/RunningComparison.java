/*
 Alice and Bob recently got into running, and decided to compare how much they ran on different days.
They each ran for N days — on the ℎ i-th day, Alice ran A^i​ meters and Bob run B^i meters.

On each day,
Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.

On how many of the N days were both Alice and Bob happy?
 */

package Problems_on_Array;
import java.util.Scanner;

public class RunningComparison {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter no. of days:-");
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            //Make array for both Alice and bob which stores running distance

            //For Alice
            for (int i = 0; i < n; i++) {
                System.out.println("Enter "+(i+1)+" Day Alice running distance:-");
                a[i] = scanner.nextInt();
            }

            //For bob
            for (int i = 0; i < n; i++) {
                System.out.println("Enter "+(i+1)+" Day Bob running distance:-");
                b[i] = scanner.nextInt();
            }
        
            //Find total count
            int count=0;
            for(int j=0;j<n;j++){
    
                if(b[j]>(2*a[j]) || a[j]>(2*b[j])){
                    count=count+0;
                }else{
                    count=count+1;
                }
            }
            System.out.println("Total Count when both are happy:- "+count);
    }
}

    
/*
 Time complexity of this code is O(n) because we are iterating through the array of running distances for both Alice and Bob. 
 Space complexity is also O(n) because we are storing the running distances in arrays.
 */