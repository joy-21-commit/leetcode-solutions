/* 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.
*/

import java.util.Arrays;

class Solution {

  public String longestCommonPrefix(String[] strs) {
    StringBuilder ans = new StringBuilder();

    Arrays.sort(strs);
    String s1 = strs[0];
    String s2 = strs[strs.length - 1];

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == s2.charAt(i)) {
        ans.append(s1.charAt(i));
      } else {
        return ans.toString();
      }
    }
    return ans.toString();
  }
}
