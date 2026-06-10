class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int numsLen=nums.length;
        // Arrays.sort(nums); O(N*logn)
        // return nums[numsLen-k];
        //Since largest ele should be found use MaxHeap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int ans=0;
        while(!pq.isEmpty() && k!=0){
            ans=pq.peek();
            pq.poll();
            k=k-1;
        }
        return ans;
    }
}