class Solution {
	public boolean solution(String s) {
		boolean answer = true;
		if ((s.length() == 4 || s.length() == 6)) {
			for (char c : s.toCharArray()) {
				if (!Character.isDigit(c)) {
					answer = false; // 숫자가 아닌 문자가 포함된 경우
					break;
				}
			}
		} else {
			answer = false;
		}
		return answer;
	}
}