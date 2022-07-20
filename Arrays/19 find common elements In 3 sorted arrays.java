/**********************************************************


Given three arrays sorted in increasing order. Find the 
elements that are common in all three arrays.
Note: can you take care of the duplicates without using any
additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80

Explanation: 20 and 80 are the only
common elements in A, B and C.
 

Your Task:  
You don't need to read input or print anything. Your task 
is to complete the function commonElements() which take
the 3 arrays A[], B[], C[] and their respective sizes n1, 
n2 and n3 as inputs and returns an array containing the 
common element present in all the 3 arrays in sorted order. 

If there are no such elements return an empty array. In 
this case the output will be printed as -1.

 

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

 

Constraints:
1 <= n1, n2, n3 <= 10^5
The array elements can be both positive or negative integers.


**********************************************************/

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> m2 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> m3 = new HashMap<Integer,Integer>();
        
        
        // put array element into hashmap with frequency
        for(int i=0;i<n1;i++){
            int key = A[i];
            if(m1.get(key) != null){
                int freq = m1.get(key);
                m1.put(key,freq+1);
            }
            else{
                m1.put(key,1);
            }
        }
        for(int i=0;i<n2;i++){
            int key = B[i];
            if(m2.get(key) != null){
                int freq = m2.get(key);
                m2.put(key,freq+1);
            }
            else{
                m2.put(key,1);
            }
        }
        for(int i=0;i<n3;i++){
            int key = C[i];
            if(m3.get(key) != null){
                int freq = m3.get(key);
                m3.put(key,freq+1);
            }
            else{
                m3.put(key,1);
            }
        }
        
        // now  search for  common elements
        
        ArrayList<Integer> common = new ArrayList<Integer>();
        
        for(int i=0;i<n1;i++){
            int num = A[i];
            if(m2.get(num) != null && m3.get(num)!= null){
                
                if(!common.contains(num))
                    common.add(num);
                
                m1.put(num,m1.get(num)-1);
                m2.put(num,m2.get(num)-1);
                m3.put(num,m3.get(num)-1);
                 
                if(m1.get(num) == 0)
                    m1.remove(num);
                if(m2.get(num) == 0)
                    m2.remove(num);
                if(m3.get(num) == 0)
                    m3.remove(num);
            
            }
            
        }
        
        return common;
        
        
    }
}


// Problem Link - https://practice.geeksforgeeks.org/problems/common-elements1132/1
