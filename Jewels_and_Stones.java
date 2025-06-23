class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char ch: jewels.toCharArray()){
            set.add(ch);
        }
        int cnt = 0;
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                cnt++;
            }
        }
        return cnt;
    }
}