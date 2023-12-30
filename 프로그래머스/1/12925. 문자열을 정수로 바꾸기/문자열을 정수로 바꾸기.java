class Solution {
    public int solution(String s) {
        s.replaceAll("[+-]", "");
        int answer=Integer.parseInt(s);
        return answer;
    }
}