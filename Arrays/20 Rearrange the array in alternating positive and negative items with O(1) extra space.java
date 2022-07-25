/************************************************************
Given an array of positive and negative numbers, arrange them
in an alternate fashion such that every positive number is 
followed by negative. 
Number of positive and negative numbers need not be equal.
If there are more positive numbers they appear at the end 
of the array. If there are more negative numbers, they to
o appear in the end of the array.

Examples : 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}


Order does not matter.

************************************************************/

class Solution {
    

    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        
        while(i<j){
            while(i < n && nums[i] > 0)
                i++;
        
            while(j>=0 && nums[j] < 0)
                j--;
            
            if(i<j){
                //swape
                swap(nums,i,j);
            }
        
        }
        if(i == 0 || i == n-1)
            return nums;
        
        int k = 1;
        
        while(k<n && i<n){
            swap(nums,k,i);
            i++;
            k+=2;
        }
        
        return nums;
    }
}
