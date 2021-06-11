package algorithm_test;

public class sort {
	
	
	/**
	 * 배열 array  의 i번째 수부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하라 
	 * [1,4,2,5,3,7,4]
	 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	
	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
	commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 
	배열에 담아 return 하도록 solution 함수를 작성해주세요.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        
	        
	        int comLength = commands.length;
	        System.out.println(comLength);
	        //1. commands 에서 i, j 값 빼와서 정렬
	        for(int i=0; i<commands.length; i++){
	        	int[] arraytest = commands[i];
	        	int start = arraytest[0];
	        	int end = arraytest[1];
	        	int getnum = arraytest[2];
	        	
	        	int[] temparray={};
	        	for(int j=0; j<end-start; j++){
	        		//temparray[] = array[j];
	        	}
	        	
	        }
	        //2. 빼온 값 정렬
	        //3. 정렬된 값에서 k 번째 값 불러오기 . 
	        
	        
	        return answer;
	    }
	}

}
