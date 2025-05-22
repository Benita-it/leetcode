#49. Group Anagrams

🔗 Problem Link (https://leetcode.com/problems/group-anagrams/)
📁 Topic: HashMap, String, Sorting

Steps:

1️⃣ Initialize a HashMap<String, List<String>> to group words by their sorted characters.
2️⃣ For each word in the input array:
  🔸 Convert the word to a char[], then sort it using Arrays.sort().
  🔸 Convert the sorted char[] back to a String (acts as the key).
  🔸 If this sorted key doesnt exist in the map, initialize a new list.
  🔸 Add the original word to the corresponding list.
3️⃣ After processing all words, return the map.values() as a new list.

Time Complexity: O(n * k log k)
→ where n is the number of strings and k is the maximum length of a string (for sorting each word)

Space Complexity: O(n * k)
→ for storing all the words in grouped lists inside the map

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sortedWord= new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}