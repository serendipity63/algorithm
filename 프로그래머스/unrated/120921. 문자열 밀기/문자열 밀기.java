class Solution {
	public int solution(String A, String B) {
		int answer = 0;
		String a = A;
		for (int i = 0; i < A.length(); i++) {
			if (a.equals(B)) {
				return answer;
			}
			String as = a.substring(a.length() - 1);
			a = as + a.substring(0, a.length() - 1);
			answer++;
		}
		return -1;
	}
}