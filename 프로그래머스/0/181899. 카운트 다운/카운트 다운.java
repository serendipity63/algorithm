class Solution {
	public int[] solution(int start, int end_num) {
		int[] answer = new int[start - end_num + 1];
		int len = start - end_num + 1;
		for (int i = 0; i < len; i++)
			answer[i] = start--;
		return answer;
	}
}