/*********************************************************************

Given an array of integers (A[])  and a number x, find the smallest
subarray with sum greater than the given value.

Note: The answer always exists. It is guaranteed that x doesn't 
exceed the summation of a[i] (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Explanation:
Minimum length subarray is {10}
 

Your Task:  
You don't need to read input or print anything. Your task is to complete
the function smallestSubWithSum() which takes the array A[], its size 
N and an integer X as inputs and returns the required ouput.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, x ≤ 105
1 ≤ A[] ≤ 104


**********************************************************************/


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        
        int minCount = Integer.MAX_VALUE;
        int count = 0;
        
        int start = 0;
        int end = 0;
        int sum = 0;
        while(start <= end && end<n){
            
            while(end < n&& sum <= x){
                sum += a[end];
                end++;
            }
            
            while(sum > x && start<=end){
                minCount = Math.min(minCount,end-start);
                sum -= a[start];
                start++;
            }
        }
        return minCount;
    }
}


// Problem Link - https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
