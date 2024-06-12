/*
Que. Our Chef has some students in his coding class who are practicing problems.
 Given the difficulty of the problems that the students have solved in order, help the Chef identify 
 if they are solving them in non-decreasing order of difficulty.
  Non-decreasing means that the values in an array is either increasing or remaining the same, but not decreasing. 
 That is, the students should not solve a problem with difficulty 1.d-1, and then later a problem with difficulty 2.d-2, where 1>d-1>d-2.
 
Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not.
 */

package Problems_on_Array;
import java.util.Scanner;

public class DifficultyRatingOrder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        //Taking total no. of quesions solve
            System.out.println("How many quesions solve:- ");
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            //Taking difficulty of each questions
            for (int i = 0; i < n; i++) {
                System.out.println("Enter difficulty of "+(i+1)+" question:-");
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            System.out.println("Solving in Non-Decending order:- ");
            for (int j=1;j<n;j++){
                if(d[j]<d[j-1]){
                    System.out.println("No");
                    break;
                }
                if(j == n-1 && d[j]>= d[j-1]){
                    System.out.println("YES");
                }
            }
        }
    }


/*
 Time Complexity: O(n)
Space Complexity: O(n)

The time complexity is O(n) because we are iterating through the array of difficulty ratings once to check if they are in non-decreasing order. 
The space complexity is also O(n) because we are storing the difficulty ratings in an array of size n.
 */
