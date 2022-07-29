/*************************************************************

You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that
takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000



we can also solve how to reverse an array in O(n) time

************************************************************/


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/reverse-a-string/1
