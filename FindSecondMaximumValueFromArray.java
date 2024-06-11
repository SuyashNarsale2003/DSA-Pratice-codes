    /*
Que.Given an array of n integers,Find minimum value from array.
*/

import java.util.Scanner;

public class FindSecondMaximumValueFromArray {
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

    //Find Maximum value
    int max=myArray[0];
    for(int j=0;j<myArray.length;j++){
        if (myArray[j]>max){
            max=myArray[j];
        }
    }

    //Find second max value
    int max2=myArray[0];
    for(int j=0;j<myArray.length;j++){
        if (myArray[j]>max2 && myArray[j]<max){
            max2=myArray[j];
        }
    }

    //Display Second max value
    System.out.println("Second Maximum value is:- "+max2);
}
}

/*
 Time complexity of this program is O(n) because we are iterating through the array once to 
 find the maximum value and then again to find the second maximum value. 
Space complexity is O(1) because we are not using any extra space that grows with the input size, only a few variables are used.
 */