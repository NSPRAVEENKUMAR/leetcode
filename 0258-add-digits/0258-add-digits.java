class Solution {
    public int addDigits(int n) {
        int result = n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9);
      return result;
    }
}