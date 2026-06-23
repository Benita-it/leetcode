class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int left=0;
        int acnt=0;
        int bcnt=0;
        int ccnt=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='a'){
                acnt++;
            }
            if(s.charAt(right)=='b'){
                bcnt++;
            }
            if(s.charAt(right)=='c'){
                ccnt++;
            }
            while(acnt>0&&bcnt>0&&ccnt>0){
                ans+=s.length()-right;
                if(s.charAt(left) == 'a') acnt--;
                if(s.charAt(left) == 'b') bcnt--;
                if(s.charAt(left) == 'c') ccnt--;

                left++;

            }
        }
        return ans;
    }
}