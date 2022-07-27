/****************************************************************************

Given an array Arr[] that contains N integers (may be positive, negative
or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
Your Task:
You don't need to read input or print anything. Your task is to 
complete the function maxProduct() which takes the array of integers 
arr and n as parameters and returns an integer denoting the answer.
Note: Use 64-bit integer data type to avoid overflow.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 500
-102 ≤ Arri ≤ 102


****************************************************************************/


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxP = Integer.MIN_VALUE;
        long currP = 1;
        
        for(int i=0;i<n;i++){
            currP = currP*arr[i];
         
            maxP = Math.max(currP,maxP);
                
            if(currP == 0)
                currP = 1;
            
        }
        
        currP = 1;
        for(int i=n-1;i>=0;i--){
            currP = currP*arr[i];
         
            maxP = Math.max(currP,maxP);
                
            if(currP == 0)
                currP = 1;
            
        }
        
        return maxP;
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
