class Solution {
	public String solution(String s) {
		char[] charArr = s.toCharArray();
		int length = s.length();
		if (length % 2 == 0) { // 문자열 길이가 짝수인 경우
			return String.valueOf(charArr, length / 2 - 1, 2);
		} else { // 문자열 길이가 홀수인 경우
			return String.valueOf(charArr[length / 2]);
		}
	}
}
