package algorithm_test;

import java.util.HashMap;

public class maraton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
         
        String not_complete = "";
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		// 아 해시 맵을 만들어서 들어온 친구인지, 중복된 친구인지 체크 하면 되는건가.
		for (int k = 0; k < participant.length; k++) {
			if (hashmap.get(participant[k]) != null) {
				int point = hashmap.get(participant[k]);
				hashmap.put(participant[k], ++point);
			} else {
				hashmap.put(participant[k], 1);
			}
		}

		for (int i = 0; i < completion.length; i++) {
			if (hashmap.get(completion[i]) != null) {
				int point = hashmap.get(completion[i]) - 1;
				if (point < 0) {
					hashmap.remove(completion[i]);
				} else {
					hashmap.put(completion[i], point);
				}
			}
		}
		
        for(String key : hashmap.keySet()){
        	Integer value = hashmap.get(key);
        	if(value > 0) answer = key;
        }
      //  answer = not_complete;
        return answer;
    }
    
}