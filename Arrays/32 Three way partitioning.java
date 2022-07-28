/*****************************************************************************

Given an array of size n and a range [a, b]. The task is to partition 
the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are 
required to return the modified array.


Example 1:

Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.


Example 2:

Input: 
n = 3 
A[] = {1, 2, 3}
[a, b] = [1, 3]
Output: 1
Explanation: One possible arrangement 
is: {1, 2, 3}. If you return a valid
arrangement, output will be 1.


Your Task:
You dont need to read input or print anything. The task is to complete 
the function threeWayPartition() which takes the array[], a and b as
input parameters and modifies the array in-place according to the given 
conditions.
Note: The generated output is 1 if you modify the given array successfully.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)




*****************************************************************************/


class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here
        //sort 0,1,2 approach
        
        
        int left = 0;
        int  mid = 0;
        int right = array.length-1;
        
        while(mid <= right){
            if(array[mid] < a){
                swap(array,left,mid);
                left++;
                mid++;
            }
            else if(a <= array[mid] && array[mid] <= b){
                mid++;
            }
            else{
                swap(array,mid,right);
                right--;
            }
        }
    }
}


// Problem Link - https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
