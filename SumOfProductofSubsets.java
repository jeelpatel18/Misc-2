/*

 Sum of the products of all possible Subsets 
 
 
Given an array of n non-negative integers. The task is to find the sum of the product of elements of all the possible subsets. It may be assumed that the numbers in subsets are small and computing product doesn’t cause arithmetic overflow.

Example :

Input : arr[] = {1, 2, 3}

Output : 23

Possible Subset are: 1, 2, 3, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}

Products of elements in above subsets : 1, 2, 3, 2, 3, 6, 6

Sum of all products = 1 + 2 + 3 + 2 + 3 + 6 + 6 = 23
*/

//TC : O(N) 
//SC : O(1)
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] arr = {1,2,3,4};
        int mult = 1;
        
        for(int n : arr){
            mult *= (n+1);
        }
        
        System.out.println("Sum of the products of all possible Subsets for given array is : " + (mult - 1));
    }
}
