class Solution {
    public int[] solution(long n) {
        int len = 0;
        for (long t = n; t > 0; t /= 10) {
            len++;
        }
        
        int[] answer = new int[len];
        
        for (int i = 0; n > 0; n /= 10) {
            answer[i++] = (int)(n %10);
        }
        
        return answer;
    }
}