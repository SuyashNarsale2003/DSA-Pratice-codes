    /*
Que.Given an array of n integers,Find minimum value from array.
*/

import java.util.Scanner;

public class FindMinimumValueFromArray {
    public static void main(String[] args) {
    
    //Taking input as array size
    System.out.println("Enter Size of array");
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    //create one dimensional array
    int[] myArray=new int[n];  //array decleration

    //Insert all elements
    for(int i=0;i<myArray.length;i++){
      System.out.println("Enter "+(i+1)+" Element:-");
      myArray[i]=sc.nextInt();
    }

    //Find Minimum value
    int min=myArray[0];
    for(int j=0;j<myArray.length;j++){
        if (myArray[j]<min){
            min=myArray[j];
        }
    }

    //Print minimum value
    System.out.println("Minimum value is:- "+min);

    }
}

/*
 Time complexity: O(n)
Space complexity: O(1)

The time complexity is O(n) because we are iterating through the array once to find the minimum value. 
The space complexity is O(1) because we are not using any extra space that grows with the input size,
 only a constant amount of space is used for variables like 'min'.
 */