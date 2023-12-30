class Solution {
	
    public int solution(int[] array) {
    	int answer=array[0];
    	int max=0;
    	int f[]= new int[1000];
    	for(int i=0; i<array.length;i++) {
    		f[array[i]]++;
    		if(max<f[array[i]]) {
    			max=f[array[i]];
    			answer=array[i];
    		}
    		
    	}
    	int temp=0;
    	for(int j=0;j<1000;j++) {
    		if(max==f[j]) temp++;
    		if(temp>1)answer =-1;
    	}
    	return answer;
    }
}