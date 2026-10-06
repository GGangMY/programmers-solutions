class Solution {
    public boolean solution(int x) {
        return (x % digitSum(x) == 0);
    }
    
    private int digitSum(int n) {
        int sum = 0;
        for (; n > 0; n /= 10) {
            sum += n % 10;
        }
        return sum;
    }
}