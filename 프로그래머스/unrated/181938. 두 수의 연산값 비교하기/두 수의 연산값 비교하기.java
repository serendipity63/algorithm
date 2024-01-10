class Solution {
    public int solution(int a, int b) {
        int case1 =Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int case2 =2*a*b;        
        return case1>case2 ? case1: case2;
    }
}