/* 
### Problem Title: Add Strings

#### Problem Description:

Given two non-negative integers, `num1` and `num2` represented as strings, return the sum of `num1` and `num2` as a string.

You must solve the problem without using any built-in library for handling large integers. Also, you must not directly convert the inputs to integers.
*/


class Solution {

  public String addStrings(String num1, String num2) {
    int d1 = num1.length() - 1;
    int d2 = num2.length() - 1;
    String ans = "";
    int carry = 0;

    while (d1 >= 0 || d2 >= 0 || carry > 0) {
      int digit1 = (d1 >= 0) ? Character.getNumericValue(num1.charAt(d1)) : 0;
      int digit2 = (d2 >= 0) ? Character.getNumericValue(num2.charAt(d2)) : 0;

        int total = digit1 + digit2 + carry;

        ans = String.valueOf(total % 10) + ans;
        carry = total / 10;

        d1--;
        d2--;
    }
      return ans;
  }
}
