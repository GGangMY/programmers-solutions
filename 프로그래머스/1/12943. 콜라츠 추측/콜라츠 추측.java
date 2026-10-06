class Solution {
    public int solution(int num) {
        long n = num;
        
        for (int t = 0; t < 500; t++) {
            if (n == 1) {
                return t;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        
        return -1;
    }
}