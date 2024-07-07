import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<intStrs.length; i++) {
			if(Integer.parseInt(intStrs[i].substring(s,s+l)) > k) {
				answer.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
			}
		}
        
        return answer;
    }
}