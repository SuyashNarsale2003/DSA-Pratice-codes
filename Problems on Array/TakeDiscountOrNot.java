/*
Que.There are N items in a shop. You know that the price of the i-th item is A^i​. Chef wants to buy all the N items.

There is also a discount coupon that costs X rupees and reduces the cost of every item by Y rupees. 
If the price of an item was initially ≤Y, it becomes free, i.e, costs 0

Determine whether Chef should buy the discount coupon or not. 
Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon 
is strictly less than the price he pays without buying the discount coupon. */


package Problems_on_Array;

import java.util.Scanner;

public class TakeDiscountOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of items:-");
            int n = scanner.nextInt();
            System.out.println("Enter discount coupan price:-");
            int x = scanner.nextInt();
            System.out.println("Enter price which reduce after discount from items:-");
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter "+(i+1)+" item:-");
                a[i] = scanner.nextInt();
            }

            //Sum of items before discount coupan
            int sumBD=0;
            for (int j=0;j<a.length;j++){
                sumBD=sumBD + a[j];    
            }
            System.out.println("Sum before discount "+sumBD);

            //for free item
            for (int j=0;j<a.length;j++){
            if(a[j]<=y){
               a[j]=0;
            }
            }

            //After apply discount coupan
            for (int k=0;k<a.length;k++){
                if(a[k]>y){
                    a[k]=a[k]-y;
                }
            }

            //Sum after apply discount coupan
            int sumAD=x;
            for (int z=0;z<a.length;z++){
                sumAD=sumAD + a[z];    
            }
            System.out.println("Sum after discount "+sumAD);

            //Determine chef should by coupan or not
            if (sumBD>sumAD){
                System.out.println("Chef should by a coupan");
            }else{
                System.out.println("Chef should not by a coupan");
            }
        }
    }


    /*
     Time Complexity: O(1)
        The time complexity of this program is constant because it does not depend on the size of the input. 
        It only involves taking input from the user and performing some calculations based on that input.

     Space Complexity: O(1)
        The space complexity of this program is also constant because it does not use any additional data structures that grow with the input size. 
        It only stores a few variables for calculations.
     */