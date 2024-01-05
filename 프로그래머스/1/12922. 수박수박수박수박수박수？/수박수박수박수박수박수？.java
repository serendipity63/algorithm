class Solution {
	public String solution(int n) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < n / 2; i++) {
			answer.append("수박");
		}

		// n이 홀수일 때는 수로 끝남
		if (n % 2 == 1) {
			answer.append("수");
		}

		return answer.toString();
	}
}