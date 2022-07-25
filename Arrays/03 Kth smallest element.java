/***************************************************************

Given an array arr[] and an integer K where K is smaller than
size of array, the task is to find the Kth smallest element in
the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.
Your Task:
You don't have to read input or print anything. Your task is to 
complete the function kthSmallest() which takes the array arr[], 
integers l and r denoting the starting and ending index of the
array and an integer K as input and returns the Kth smallest element.
 
 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N
****************************************************************/


class Solution{
    private static int getMaxValue(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int max = getMaxValue(arr);
        // return max;
        int counter[] = new int[max+1];
        
        for(int i=l;i<=r;i++){
            counter[arr[i]]++;
        }
        int smallest = 0;
        for(int num = 1;num<=max;num++){
            
            // if(counter[num]>0)  
                smallest += counter[num];
                
            if(smallest >= k)
                return num;
             
        }
        
        return -1;
        
      
    } 
}


// Problem Link - https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
