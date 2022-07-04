/********************************************************
Problem Statement - 
[Code studio code, click here](https://www.codingninjas.com/codestudio/problems/merge-intervals_699917?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1)

Approach - 

first we sort intervals based on first number and then
create two variable start and finish that store 0th 
interval start and finish value.
Now compare these both value with other  intevals 
start and finish value.
        
if next interval can be merge in this interval we just
update these start and finish value by merging both.
if not, put this interval in result and update these 
value by new interval start and finish value.
Ansd at last put start and finish values in result as 
form of interval.

time - O(logn) + O(n)

********************************************************/




import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> res = new ArrayList<Interval>();
        
        // sort intervals based on first number
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });   
        
        int start = intervals[0].start;
        int finish = intervals[0].finish;
        
        int intervalSize = intervals.length;
        for(int i=1;i<intervalSize;i++){
            if(finish>= intervals[i].start){
                finish = Math.max(finish,intervals[i].finish);
            }else{
                res.add(new Interval(start,finish));
                start = intervals[i].start;
                finish = intervals[i].finish;
            }
        }
        
        res.add(new Interval(start,finish));
            
        
        
        return res;
    }
}
