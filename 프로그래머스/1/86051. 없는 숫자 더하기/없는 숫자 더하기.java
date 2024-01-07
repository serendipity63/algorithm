import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = IntStream.range(0, 10)     //0부터 9까지 숫자 생성
        			.filter(num -> Arrays.stream(numbers).noneMatch(x -> x==num)) //numbers배열에 없는 숫자 필터링
        			.sum(); //누락된 숫자들합 구하기
        
        return answer;
    }
}