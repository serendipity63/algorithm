import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int divisor) {
		int count = 0;

		// divisor로 나누어 떨어지는 요소의 개수를 세기
		for (int num : arr) {
			if (num % divisor == 0) {
				count++;
			}
		}

		// divisor로 나누어 떨어지는 요소가 없으면 -1을 담은 배열 반환
		if (count == 0) {
			return new int[] { -1 };
		}

		// divisor로 나누어 떨어지는 요소를 담을 배열 생성
		int[] result = new int[count];
		int idx = 0;

		// divisor로 나누어 떨어지는 요소를 배열에 담기
		for (int num : arr) {
			if (num % divisor == 0) {
				result[idx++] = num;
			}
		}

		// 오름차순으로 정렬
		Arrays.sort(result);

		return result;
	}
}