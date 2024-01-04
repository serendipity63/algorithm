import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
    	//숫자를 문자열로 변환
        String sn=Long.toString(n);
        //문자열을 숫자 배열로 변환
        Character[] chars= new Character[sn.length()];
        for(int i=0;i<sn.length();i++) {
        	chars[i]=sn.charAt(i);
        	
        }
        //문자배열을 내림차순으로 정렬
        Arrays.sort(chars, Collections.reverseOrder());
        //정렬된 문자 배열을 문자열로 결합하여 숫자로 변환
        StringBuilder sortStr= new StringBuilder(chars.length);
        for(char c: chars) {
        	sortStr.append(c);
        }
        //정렬된 문자열을 숫자로 반환
        return Long.parseLong(sortStr.toString());
    }
}