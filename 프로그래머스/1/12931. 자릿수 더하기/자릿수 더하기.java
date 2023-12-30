import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString=Integer.toString(n);
        char[] digits=nString.toCharArray();
        for(char digit: digits) {
        	int num= Character.getNumericValue(digit);
        	answer+=num;
        	
        }
        
        System.out.println(answer);
        return answer;
    }
}