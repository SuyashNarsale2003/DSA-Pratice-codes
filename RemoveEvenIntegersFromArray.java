/*
Que.Given an array of n integers,return an array with even integers removed.
*/

import java.util.Scanner;

public class RemoveEvenIntegersFromArray{
    public static void main(String[] args){
      //Taking input as array size
        System.out.println("Enter Size of array");
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();

      //create one dimensional array
      int[] myArray=new int[n];

      //Insert all elements
      for(int i=0;i<myArray.length;i++){
        System.out.println("Enter "+(i+1)+" Element:-");
        myArray[i]=sc.nextInt();
      }

      //Find count of odd element
      int Odd=0;
      for(int j=0;j<myArray.length;j++){
        if(myArray[j] %2!=0){
            Odd=Odd+1;
        }
      }

      //Make array for storing odd numbers
      int oddArray[]=new int[Odd];

      //Add odd elements in oddarray
      int e=0;
      for(int k=0;k<myArray.length;k++){
        if(myArray[k] %2!=0){
            oddArray[e]=myArray[k];
            e=e+1;
        }
      }
      
      //Print oddArray
      for(int m:oddArray){
        System.out.println(m);
      }

    }
}

/*
The time complexity of this program is O(n), where n is the size of the input array. This is because we iterate through the input array twice - once to count the number of odd elements and once to store the odd elements in a new array.

The space complexity of this program is also O(n), as we create a new array to store the odd elements, which can potentially have the same size as the input array.

Overall, the time and space complexity of this program is linear, as it scales linearly with the size of the input array.
*/ 
