/*********************************************************************

Implement the next permutation, which rearranges the list of
numbers into Lexicographically next greater permutation of list 
of numbers. If such arrangement is not possible, it must be rearranged
to the lowest possible order i.e. sorted in an ascending order.
You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.
Example 2:

Input: N = 3
arr = {3, 2, 1}
Output: {1, 2, 3}
Explaination: As arr[] is the last 
permutation. So, the next permutation 
is the lowest one.
Your Task:
You do not need to read input or print anything. Your task is to 
complete the function nextPermutation() which takes N and arr[ ] 
as input parameters and returns a list of numbers containing the 
next permutation.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10000



*********************************************************************/


// User function Template for Java
class Solution{
    static void swap(int arr[],int i,int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[],int left,int right){
        while(left <= right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i >= 0){
            int j=n-1;
            while(j>=0 && arr[j]<=arr[i])
                j--;
            
            swap(arr,i,j);
        }
        
        reverse(arr,i+1,n-1);
        
        List<Integer> res = new ArrayList<Integer>();
        for(int k=0;k<n;k++){
            res.add(arr[k]);
        }
        return res;
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/next-permutation5226/1
