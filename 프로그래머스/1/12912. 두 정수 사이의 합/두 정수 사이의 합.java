class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        
        if (a <= b) {
            while (a <= b) {
                sum += a++;
            }
            return sum;
        }
        
        while(a >= b) {
            sum += b++;
        }
        return sum;
    }
}