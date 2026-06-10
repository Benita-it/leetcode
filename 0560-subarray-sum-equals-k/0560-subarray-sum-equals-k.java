// class Solution {
//     public int subarraySum(int[] nums, int k) {
        
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        int numsLen=nums.length;
        int sum=0,cnt=0;
        for(int i=0;i<numsLen;i++){
            sum=0;
            for(int j=i;j<numsLen;j++){
                sum=sum+nums[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}