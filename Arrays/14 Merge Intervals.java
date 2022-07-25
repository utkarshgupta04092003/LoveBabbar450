/**********************************************************************

Given a collection of Intervals, the task is to merge all of the 
overlapping Intervals.

Example 1:

Input:
Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
[6,8], [9,10].
Example 2:

Input:
Intervals = {{6,8},{1,9},{2,4},{4,7}}
Output: {{1, 9}}
Your Task:
Complete the function overlappedInterval() that takes the list N 
intervals as input parameters and returns sorted list of intervals
after merging.

Expected Time Complexity: O(N*Log(N)).
Expected Auxiliary Space: O(Log(N)) or O(N).

Constraints:
1 ≤ N ≤ 100
0 ≤ x ≤ y ≤ 1000

**********************************************************************/


class Solution
{
    public static  void sort (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] > second[columnNumber-1]) return 1;
               else return -1;
            }
        });
    }



    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        sort(Intervals,1);
        int row = Intervals.length;
        int col = 2;
        for(int i=0;i<row;i++){
            
        }
        return Intervals;
    }
}

// Problem Link - https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1
