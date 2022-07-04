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
