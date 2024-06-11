     /*
Que.Given an array of n integers,return an reverse of that array.
*/

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

      //Taking input as array size
      System.out.println("Enter Size of array");
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();

      //create one dimensional array
      int[] myArray=new int[n];  //Original array decleration
      int[] revArray=new int[n]; //reverse array decleration

      //Insert all elements
      for(int i=0;i<myArray.length;i++){
        System.out.println("Enter "+(i+1)+" Element:-");
        myArray[i]=sc.nextInt();
      }

      //reverse array
      int v=0;
      for (int j=n-1;j>=0;j--){
        revArray[v]=myArray[j];
        v=v+1;
      }

      //Display reverse array
      System.out.println("Reverse array");
      for(int s:revArray){
        System.out.println(s);
      }
    }
    
}

/*
 The time complexity of this program is O(n) because we are iterating through the array once to reverse it. The space complexity is also O(n) because we are creating a new array of the same size as the original array to store the reversed elements.
 */
