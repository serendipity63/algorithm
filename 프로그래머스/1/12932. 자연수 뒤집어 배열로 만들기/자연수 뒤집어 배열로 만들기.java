import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
	public int[] solution(long n) {
		int[] answer = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		IntStream.range(0, answer.length / 2).forEach(i -> {
			int temp = answer[i];
			answer[i] = answer[answer.length - 1 - i];
			answer[answer.length - 1 - i] = temp;
		});

		return answer;
	}
}