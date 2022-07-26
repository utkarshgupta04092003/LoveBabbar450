/************************************************************************

Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far 
(or close) the array is from being sorted. If array is already sorted 
then the inversion count is 0. If an array is sorted in the reverse 
order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j]
and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete 
the function inversionCount() which takes the array arr[] and the size 
of the array as inputs and returns the inversion count of the given
array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018
************************************************************************/


class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long mergeSort(long arr[],int left,int mid,int right){
        
        int leftSize = mid-left+1;
        int rightSize = right-mid;
        
        long leftArr[] = new long[leftSize];
        long rightArr[] = new long[rightSize];
        
        for(int i=left,k=0;i<=mid;i++,k++){
            leftArr[k] = arr[i];    
        }
        for(int j=mid+1,k=0;j<=right;j++,k++){
            rightArr[k] = arr[j];
        }
        
        // merging
        int l = 0;
        int r = 0;
        long swap = 0;
        int k = left;
        while(l<leftSize && r<rightSize){
            if(leftArr[l] <= rightArr[r]){
                arr[k] = leftArr[l];
                k++;
                l++;
            }
            
            else{
                arr[k] = rightArr[r];
                k++;
                r++;
                
                swap += (leftSize-l);
            }
        }
        
         while(l < leftSize){
            arr[k] = leftArr[l];
            k++;
            l++;
            
        }
        while(r < rightSize){
            arr[k] = rightArr[r];
            k++;
            r++;
            
        }
      return swap;
        
    }
    
    
    static long mergeSortAndCount(long arr[],int left,int right){
        long count = 0;
        
        if(left < right){
            int mid = (left+right)/2;
            
            
            count = mergeSortAndCount(arr,left,mid);
            
            count += mergeSortAndCount(arr,mid+1,right);
            count += mergeSort(arr,left,mid,right);
        }
        return count;
        
    }
    
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        long count = mergeSortAndCount(arr,0,(int)N-1);
        return count;
        
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
