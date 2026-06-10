class Solution {
    public int findKthLargest(int[] nums, int k) {
        int numsLen=nums.length;
        // Arrays.sort(nums); O(N*logn)
        // return nums[numsLen-k];
        //Since largest ele should be found use MaxHeap
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int ans=0;
        if(k/2>numsLen/2){
            for(int i=0;i<nums.length;i++){
                minHeap.offer(nums[i]);
            }
            while(!minHeap.isEmpty() && k!=0){
                ans=minHeap.peek();
                minHeap.poll();
                k--;
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                maxHeap.offer(nums[i]);
            }
            while(!maxHeap.isEmpty() && k!=0){
                ans=maxHeap.peek();
                maxHeap.poll();
                k--;
            }
        }
        return ans;
    }
}