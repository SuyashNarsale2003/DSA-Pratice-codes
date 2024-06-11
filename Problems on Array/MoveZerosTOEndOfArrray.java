 /*
Que.Given an array of n integers,Make array which contain all zeros at end of array.
*/

import java.util.Scanner;

public class MoveZerosTOEndOfArrray {
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

    //Code for move all zeros at end
    int j=0;
    for (int k=0;k<myArray.length;k++){
        if (myArray[k]!=0 && myArray[j]==0){
            int temp=myArray[j];
            myArray[j]=myArray[k];
            myArray[k]=temp;
        }
        if (myArray[k]==0 && myArray[j]!=0) {
            j++;    
        }
    }

System.out.println("Array after moving zeros:-");
for(int z:myArray){
    System.out.println(z);
}
    }
    
}


/*
 The time complexity of this code is O(n), where n is the size of the array.
  This is because we iterate through the array only once to move the zeros to the end.

The space complexity of this code is O(1), as we are not using any extra space that grows with the input size. 
We are simply swapping elements in the existing array.
 */