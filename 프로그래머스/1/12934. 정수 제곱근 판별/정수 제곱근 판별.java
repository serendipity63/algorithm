class Solution {
	public long solution(long n) {
		long sqrt = (long) Math.sqrt(n);
		// n의 제곱근
		if (sqrt * sqrt == n) {
		//만약 n이 어떤 양의 정수 x의 제곱이라면	
			return (sqrt + 1) * (sqrt + 1);
		//x+1의 제곱 반환	
		} else {
			return -1;
		}
	}
}