class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		String xString = Integer.toString(x); //x를 string으로 변환
		char[] digits = xString.toCharArray(); //x를 chararray로 변환
		for (char digit : digits) {
			int num = Character.getNumericValue(digit);
			sum += num;
		}
		if (x % sum != 0) {
			answer = false;
		}
		return answer;
	}
}