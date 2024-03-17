import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
	public List<String> solution(String my_str, int n) {
		return IntStream.iterate(0, i -> i < my_str.length(), i -> i + n)
				.mapToObj(i -> my_str.substring(i, Math.min(my_str.length(), i + n))).collect(Collectors.toList());
	}

}
