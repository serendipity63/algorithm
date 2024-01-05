class Solution {
	public String solution(String[] seoul) {
		String answer = "";
		int position = 0;// kim의 위치 저장변수
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) { // "kim"을 찾으면 해당 위치를 position 변수에 저장하고 반복문 종료
				position = i;
				break;
			}

		}
		answer = "김서방은 " + position + "에 있다";
		return answer;
	}
}