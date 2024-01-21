class Solution {
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		int count = 0;
		for (String arrs : arr) {
			count = arrs.contains(" ") ? 0 : count + 1;
			answer += count % 2 == 0 ? arrs.toLowerCase() : arrs.toUpperCase();
		}

		return answer;
	}
}