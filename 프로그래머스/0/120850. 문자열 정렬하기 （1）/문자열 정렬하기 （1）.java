import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList answer = new ArrayList(); // 48 - 57
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= 48 && my_string.charAt(i)<=57){
                answer.add(my_string.charAt(i)-'0');
            }
        }
        Collections.sort(answer);
        
        return answer;
    }
}