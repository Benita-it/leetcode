class Solution {
    int[] NGEFunction(int[] nums){
        int numslen=nums.length;
        int[] finalans=new int[numslen];
        Stack<Integer> s1=new Stack<>();
        for(int i=numslen-1;i>=0;i--){
            while(!s1.isEmpty() && nums[i] >= s1.peek()){
                s1.pop();
            }
            int ans=s1.isEmpty()==true?-1:s1.peek();
            finalans[i]=ans;
            s1.push(nums[i]);
        }
        return finalans;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nums1Len=nums1.length;
        int nums2Len=nums2.length;
        int[] finalans=new int[nums1Len];
        int[] NGE=NGEFunction(nums2);
        for(int i=0;i<nums1Len;i++){
            for(int j=0;j<nums2Len;j++){
                if(nums1[i]==nums2[j]){
                    finalans[i]=NGE[j];
                    break;
                }
            }
        }
        return finalans;
    }
}