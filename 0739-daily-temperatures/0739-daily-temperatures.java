class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arrlen=temperatures.length;
        int[] finalans=new int[arrlen];
        Stack<Integer> s1=new Stack<>();
        for(int i=arrlen-1;i>=0;i--){
            while(!s1.isEmpty() && temperatures[i]>=temperatures[s1.peek()]){
                s1.pop();
            }
            int ans=s1.isEmpty()==true?0:Math.abs(s1.peek()-i);
            finalans[i]=ans;
            s1.push(i);
        }
        return finalans;
    }
}