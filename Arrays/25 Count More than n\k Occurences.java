/**********************************************************************

Given an array arr[] of size N and an element k. The task is to find
all elements in array that appear more than n/k times.

Example 1:

Input:
N = 8
arr[] = {3,1,2,2,1,2,3,3}
k = 4
Output: 2
Explanation: In the given array, 3 and
 2 are the only elements that appears 
more than n/k times.
Example 2:

Input:
N = 4
arr[] = {2,3,3,2}
k = 3
Output: 2
Explanation: In the given array, 3 and 2 
are the only elements that appears more 
than n/k times. So the count of elements 
are 2.
Your Task:
The task is to complete the function countOccurence() which returns
count of elements with more than n/k times appearance.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 104
1 <= a[i] <= 106
1 <= k <= N

**********************************************************************/



class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else{
                map.put(key,1);
            }
        }
        
        int count = 0;
        for(int num : map.keySet()){
            if(map.get(num) > (n/k))
                count++;
        }
        
        return count;
    }
    
}


// Problem Link - https://practice.geeksforgeeks.org/problems/count-element-occurences/0?category%5B%5D=Searching&page=1&query=category%5B%5DSearchingpage1
