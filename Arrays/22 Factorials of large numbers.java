/**********************************************************

Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

Your Task:
You don't need to read input or print anything. 
Complete the function factorial() that takes integer N as
input parameter and returns a list of integers denoting the
digits that make up the factorial of N.


Expected Time Complexity : O(N2)
Expected Auxilliary Space : O(1)


Constraints:
1 ≤ N ≤ 1000


*************************************************************/


class Solution {
    static void multiply(int n,ArrayList<Integer> fact){
        int carry = 0;
        
        for(int i=0;i<fact.size();i++){
            int num = fact.get(i)*n + carry;
            int lastDigit = num%10;
            fact.set(i,lastDigit);
            carry = num/10;
        }
        
        while(carry > 0){
            int lastDigit = carry%10;
            fact.add(lastDigit);
            carry = carry/10;
        }
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> fact = new ArrayList<Integer>();
        fact.add(1);
        
        for(int i=2;i<=N;i++){
            multiply(i,fact);
        }
        
        Collections.reverse(fact);
        return fact;
        
    }
}


// Problem Link - https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1
