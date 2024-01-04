class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int start=Math.min(a, b); //두 정수 중 작은거
        int end=Math.max(a, b); //큰거
        for(int i=start;i<=end; i++) {
        	answer+=i;
        } //중간값 더한다
        return answer;
    }
}