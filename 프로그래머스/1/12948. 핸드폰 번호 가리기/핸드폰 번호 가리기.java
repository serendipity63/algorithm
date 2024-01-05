class Solution {
	public String solution(String phone_number) {
		StringBuilder str = new StringBuilder(phone_number.length());

		for (int i = 0; i < phone_number.length() - 4; i++) {
			str.append("*"); //뒤에 4자리를 제외한 부분만큼 *를 추가
		}
		str.append(phone_number.substring(phone_number.length() - 4));
		//전화번호의 뒤에서 4자리 가져와서 str에 추가
		return str.toString();
	}
}