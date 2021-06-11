package algorithm_test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class phonenumber {

	/** 
	 * hashmap : 타 언어의 사전같은 역할을 하는 자료구조. 
	 * 가장 중요한 점은 역시 기적적인 jash의 성능을 통해 저장된 key에 해당하는 value 를 0(1)의 시간 복잡도로 검색이 가능하다는 것.  
	 * 
	 * replace()와 get()을 통해 접근, 수정하도록 하자. 
	 * hashmap.containskey(k), 
	 * hashmap.containsValue(v)\
	 *  - 이름처럼 맵에 key나 value의 포함을 확인하는 함수 . containskey를 통해 키가 있는지 확인하고 없으면 put 해주는 식으로 사용
	 *  
	 * hashmap.keyset() / hashmap.values()
	 *  - key와 value를 모아놓은 자료구조를 각각 반환하는 메서드. 
	 * 
	 * string - startwith  함수 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
		//["119", "97674223", "1195524421"] - 테스트 케이스 /
		//이걸 해시맵으로..어케 하지
		//
		
		//1. 길이가 비교대상보다 짧아야해. 비교대상 길이가 짧으면 비교할 수가 없음. 
		//2. 비교단어와, 비교 대상을 선정하는 방법은 어떻게 처리 하면 될까. 
		// 아 그럼 정렬해서 가장 짧은거로 다음 문자들만 비교하는거구나? 그리 생각 할 수 도 있겠네.  
		
		
	    public boolean solution(String[] phone_book) {
	    	   boolean answer = true;

	    	   for(int i=0; i<phone_book.length-1; i++){
	    		   
	    		   for(int j=i+1; j<phone_book.length; j++){
	    			   if(phone_book[i].startsWith(phone_book[j])) {return false;}
	    			   if(phone_book[j].startsWith(phone_book[i])) {return false;}
	    		   }
	    		   
	    	   }

	    	   return true;
	    }
	    
	    
	}
}
