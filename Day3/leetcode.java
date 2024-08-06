import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    // public class Pair implements Comparable<Pair>{
    //     int ele;
    //     int freq;
    //     Pair(int ele, int freq){
    //         this.ele = ele;
    //         this.freq = freq;
    //     }

    //     @Override
    //     public int compareTo(Pair p) {
    //         return this.freq - p.freq;
    //     }
    // }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }
            else{
                map.put(ele, 1);
            }
        }
        
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
            if(pq.size()>k) pq.remove();
        }
        for(int i = 0; i<k; i++){
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }

    // LeetCode 1636

    public int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];

        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            } else{
                map.put(ele,1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
        }

        int index = 0;
        while(pq.size() != 0){
            Pair p = pq.remove();
            for(int i = 0; i<p.freq;i++){
                ans[index++] = p.ele;
            }
        }


        return ans;
    }
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            if(this.freq == p.freq){
                return p.ele - this.ele;
            }
            return this.freq - p.freq;
        }
    }

    // Leetcode 1046
    public int lastStoneWeight1(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int ele : stones){
            list.add(ele);
        }   
        while(list.size()>1){
            Collections.sort(list);
            int y = list.remove(list.size()-1);
            int x = list.remove(list.size()-1);

            if(y!=x) list.add(y-x);
        }
        if(list.size()==0) return 0;
        return list.get(0);
    }


    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : stones){
            pq.add(ele);
        }

        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();

            if(y!=x) pq.add(y-x); 
        }

        if(pq.size() == 0) return 0;
        return pq.remove();
    }

    public static long connectRopes(int[] arr)
    {
        //Write your code here
        long cost = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int ele : arr){
            minHeap.add(ele);
        }
        while(minHeap.size() != 0){
            int a = minHeap.poll();
            int b = minHeap.poll();

            int c = a+b;
            minHeap.add(c);
            cost += c;
        }

        return cost;
    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = heights.length;

        for(int i = 1; i<n; i++){
            int diff = heights[i] - heights[-1];
            if(diff > 0){
                pq.add(diff);
                if(pq.size() > ladders){
                    bricks -= pq.poll();
                }
                if(bricks < 0) return i-1;
            }
        }
        return n - 1;
    }
}