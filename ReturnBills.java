/* 
At a lemonade stand where each drink costs $5, you have customers lining up to purchase lemonades with either a $5, $10, or $20 bill. Your task is to make sure each customer receives the correct change, so their payment amounts to exactly $5 for the lemonade.

Initially, you start without any bills to provide as change. You are given an array `bills` where each `bills[i]` represents the bill paid by the i-th customer. The goal is to determine whether you can return the appropriate change to every customer as they process in the given order.

For instance:

1. With the input `bills = [5,5,5,10,20]`, the result should be `true`. Here's how it breaks down: the first three customers pay with $5 bills, which means you collect three $5 bills. The fourth customer pays with a $10 bill, allowing you to give one $5 bill as change. The last customer pays with a $20 bill, and you can provide them with one $10 bill and one $5 bill as change. Since all customers received the correct change, the answer is `true`.

2. When the input is `bills = [5,5,10,10,20]`, the result is `false`. Here's why: the first two customers pay using $5 bills, leaving you with two $5 bills collected. The next two customers pay with $10 bills, which requires you to give out those two $5 bills as change. When the final customer pays with a $20 bill, you need to give $15 as change, but with only two $10 bills available, correct change cannot be provided, resulting in `false`.
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
    int ten = 0;
    int twenty = 0;

    for (int i = 0; i < bills.length; i++) {
      if (bills[i] == 5) {
        five++;
      } else if (bills[i] == 10) {
        if (5 * five >= 5) {
          ten++;
          five--;
        } else {
          return false;
        }
      } else if (bills[i] == 20) {
        if (5 * five >= 15) {
          twenty++;
          five -= 3;
        } else if (10 * ten >= 10 && 5 * five >= 5) {
          twenty++;
          ten--;
          five--;
        } else {
          return false;
        }
      }
    }
    return true;
    }
}