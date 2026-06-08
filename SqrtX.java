/* 
Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. The returned integer should also be non-negative.

You must not use any built-in exponent function or operator.

For example, do not use `pow(x, 0.5)` in C++ or `x ** 0.5` in Python.
*/

class Solution {

  public int integerSquareRoot(int x) {
    if (x < 2) {
      return x;
    }

    int left = 1;
    int right = x;
    int ans = 0;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      long sq = (long) mid * mid;

      if (sq == x) {
        return mid;
      }

      if (sq < x) {
        ans = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return ans;
  }
}
