/**************************************************************************

Given a Integer array A[] of n elements. Your task is to complete the 
function PalinArray. Which will return 1 if all the elements of the Array 
are palindrome otherwise it will return 0.

 

Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0

Explanation:
For First test case.
n=5;
A[0] = 111    //which is a palindrome number.
A[1] = 222   //which is a palindrome number.
A[2] = 333   //which is a palindrome number.
A[3] = 444  //which is a palindrome number.
A[4] = 555  //which is a palindrome number.
As all numbers are palindrome so This will return 1.

Constraints:
1 <=T<= 50
1 <=n<= 20
1 <=A[]<= 10000
***************************************************************************/

class GfG
{
    static int rev(int num){
        
        int rev = 0;
        while(num > 0){
            rev *= 10;
            int rem = num%10;
            rev += rem;
            num /= 10;
        }
        return rev;
    }
	public static int palinArray(int[] a, int n)
    {
          //add code here.
          for(int i=0;i<n;i++){
              if(a[i] != rev(a[i]))
                return 0;
          }
          
          return 1;
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1
