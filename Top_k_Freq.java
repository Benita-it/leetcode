# Top K Frequent Elements (LeetCode #347)

## 🔗 Problem Link (https://leetcode.com/problems/top-k-frequent-elements/)
## 📁 Topic: HashMap, Priority Queue

## ✅ Approach

This solution uses a **HashMap** to count frequencies and a **Max Heap (PriorityQueue)** to efficiently extract the `k` most frequent elements.

### 🚀 Steps:
1. **Count Frequencies**:
   - Use a `HashMap<Integer, Integer>` to store the count of each number.
2. **Build Max Heap**:
   - Use a `PriorityQueue<Integer>` with a custom comparator to sort numbers by frequency (most frequent first). [->(lambda expression)]
3. **Extract Top K**:
   - Poll the heap `k` times to get the top `k` frequent elements.


import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        for(int key: map.keySet()){
            maxHeap.add(key);
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=naxHeap.poll();
        }
        return res;
    }
}
