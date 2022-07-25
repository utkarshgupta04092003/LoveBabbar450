/******************************************************************

Given an unsorted array arr[] of size N having both negative and 
positive integers. The task is place all negative element at the
end of array without changing the order of positive element and 
negative element.

 

Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:

Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
 

Your Task:  
You don't need to read input or print anything. Your task is to 
complete the function segregateElements() which takes the array 
arr[] and its size N as inputs and store the answer in the array 
arr[] itself.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 


Constraints:
1 ≤ N ≤ 105
-105 ≤ arr[] ≤ 105
*******************************************************************/


// if Order of positive and negative numbers should not change from array.

class Solution {
    private int negElementNum(int arr[]){
        int n = arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                res++;
            }
        }
        return res;
    } 
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int negNum = negElementNum(arr);
        int posNum =n-negNum;
        int negElement[] = new int[negNum];
        int posElement[] = new int[posNum];
        
        
        int  pos=0,neg=0;
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                negElement[neg] = arr[i];
                neg++;
            }
            else{
                posElement[pos] = arr[i];
                pos++;
            }
        }
        int i=0,j=0,k=0;
        while(pos>0){
            arr[k] = posElement[i];
            i++;
            k++;
            pos--;
        }
        while(neg>0){
            arr[k] = negElement[j];
            j++;
            k++;
            neg--;
        }
        
    }
}


/*
Time complexity - O(n)
Extra space - O(n)

*/

// If order does not matter.


class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        
        int left = 0;
        int right = n-1;
        
        while(left <= right){
            if(arr[left] > 0){
                left++;
            }
            else{
                if(arr[right] < 0){
                    right--;
                }
                else{
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }
}

/*
Time complexity - O(n)
Extra space - O(1)
*/
// Problem Link - https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
