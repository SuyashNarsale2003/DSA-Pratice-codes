/*
 Chef visited a grocery store for fresh supplies. There are N items in the store where the ℎ-i th
  item has a freshness value A^i and cost B^i.

Chef has decided to purchase all the items having a freshness value greater than equal to X.
 Find the total cost of the groceries Chef buys.
 */

package Problems_on_Array;
import java.util.Scanner;

public class CostOfGroceris {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of store");
            int n = scanner.nextInt();
        System.out.println("Enter minimum freshness value you want:-");
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
        //Taking values of items
           //1.Freshness values    
            for (int i = 0; i < n; i++) {
                System.out.println("Enter "+(i+1)+" item Freshness value:-");
                a[i] = scanner.nextInt();
            }
           //2.Cost of items 
            for (int j = 0; j < n; j++) {
                System.out.println("Enter "+(j+1)+" item Cost:-");
                b[j] = scanner.nextInt();
            }
            
        //Find sum of items whoose freshness value is greator than x
            int sum=0;
            for(int i=0;i<n;i++){
                if(a[i]>=x){
                    sum=sum+b[i];
                }
            }
            System.out.println(sum);
        }
    }


    
/*
 Time complexity of this program is O(n) because we are iterating through the array of items only once.
 Space complexity is also O(n) because we are storing the freshness values and costs of items in separate arrays.
 */
