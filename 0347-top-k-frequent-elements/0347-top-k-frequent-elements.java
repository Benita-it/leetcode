class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> h1=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((b,a)->a[0]-b[0]);
        for(int i=0;i<nums.length;i++){
            var it=h1.get(nums[i]);
            if(it==null){
                h1.put(nums[i],1);
            }
            else{
                h1.put(nums[i],it+1);
            }
        }
        for(var it:h1.entrySet()){
            int key=it.getKey();
            int value=it.getValue();
            pq.offer(new int[]{value,key});
        }
        int index=0;
        while(!pq.isEmpty() && k!=0){
            var arr=pq.peek();
            pq.poll();
            k--;
            ans[index]=arr[1];
            index++;
        }
        return ans;
    }
}