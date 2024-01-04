class Solution {
	public int solution(long num) {
		int answer = 0;

		while (num != 1) { //1이 아니면 
			if (answer >= 500) { 
				return -1;
			}

			if (num % 2 == 0) { //짝수면 
				num /= 2; //2로 나눔
			} else {
				num = num * 3 + 1; //홀수면 3을 곱하고 1을 더함
			}
			answer++;
		}

        return num == 1 ? answer : 0; // 주어진 수가 1이면 0을 반환
	}
}
