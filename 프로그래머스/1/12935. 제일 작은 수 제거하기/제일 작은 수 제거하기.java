import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1}; // 배열의 길이가 1 이하인 경우, -1이 들어간 배열 반환
        }
        
        int min = Arrays.stream(arr).min().getAsInt(); // 배열에서 최솟값을 찾음
        
        // 최솟값을 제외한 배열을 생성
        int[] answer = Arrays.stream(arr)
                            .filter(num -> num != min)
                            .toArray();
        
        return answer;
    }
}