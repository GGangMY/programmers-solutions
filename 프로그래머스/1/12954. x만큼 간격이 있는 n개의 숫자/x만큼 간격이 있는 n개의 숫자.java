class Solution {
    public long[] solution(int x, int n) {
        long[] numbers = new long[n];
        long num = x;
        
        for(int i = 0; i < n; i++) {
            numbers[i] = num;
            num += x;
        }
        
        return numbers;
    }
}