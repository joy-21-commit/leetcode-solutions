class Solution {

  public String addBinary(String a, String b) {
    int decNum = binToDec(a) + binToDec(b);
    return decToBin(decNum);
  }

  public int binToDec(String str) {
    int pow = 0;
    int val = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      val += (int) Math.pow(2, pow) * (str.charAt(i) - '0');
      pow++;
    }
    return val;
  }

  public String decToBin(int num) {
    if (num == 0) return "0";
    String bin = "";
    while (num > 0) {
      bin = (num % 2) + bin;
      num /= 2;
    }
    return bin;
  }
}
