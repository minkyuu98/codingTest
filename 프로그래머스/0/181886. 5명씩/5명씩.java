import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] names) {
        
        ArrayList<String> answer = new ArrayList<String>();
        
        
        
        for(int i=0; i<names.length; i++){
            if(i % 5 ==0){
                answer.add(names[i]);
            }
        }
        
        
        return answer;
    }
}