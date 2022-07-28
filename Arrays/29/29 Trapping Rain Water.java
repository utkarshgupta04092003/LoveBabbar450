/***********************************************************************

Given an array arr[] of N non-negative integers representing the 
height of blocks. If width of each block is 1, compute how much water
can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.

Your Task:
You don't need to read input or print anything. The task is to
complete the function trappingWater() which takes arr[] and N as
input parameters and returns the total amount of water that can 
be trapped.



Constraints:
3 < N < 106
0 < Ai < 108

************************************************************************/


//Method - 01

// Expected Time Complexity: O(N^2)
// Expected Auxiliary Space: O(1)



class Solution{
    
    // O(n^2) and O(1)
    static long trappingWater(int arr[], int n) { 

        int count = 0;
        
        for(int i=0;i<n;i++){
            
            int maxLeft = arr[i];
            int maxRight = arr[i];
            
            for(int j=i;j>=0;j--){
                if(arr[j] > maxLeft){
                    maxLeft = arr[j];
                }
            }
            
            for(int j=i+1;j<n;j++){
                if(arr[j] > maxRight){
                    maxRight = arr[j];
                }
            }
            
            count += Math.min(maxLeft,maxRight)-arr[i];
        }
        
        return count;
    } 
    
}


//Method - 02

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)



class Solution{
    
    static long trappingWater(int arr[], int n) { 

        long count = 0;
        
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            leftMax[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            rightMax[i] = max;
        }
        
        for(int i=0;i<n;i++){
            
            count += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        
        return count;
        
    } 
}




//Method - 03

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)



class Solution{
   static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int left = 0;
        int right = n-1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        long count = 0;
        
        while(left <= right){
            
            if(arr[left] < arr[right]){
                
                leftMax = Math.max(leftMax,arr[left]);
                count += leftMax-arr[left];
                
                left++;
            }
            else{
                
                rightMax = Math.max(rightMax,arr[right]);
                count += rightMax-arr[right];
                
                right--;
            }
            
            
        }
        
        return count;
    } 
}



// Problem Link - https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1


