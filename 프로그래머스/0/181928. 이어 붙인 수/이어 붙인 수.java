class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String numA = ""; //홀
        String numB = ""; //짝
        
        for(int i=0; i<num_list.length; i++){
            
            if(num_list[i] % 2 == 0){
                numA += Integer.toString(num_list[i]);
            }else{
                numB += Integer.toString(num_list[i]);
            }
            
        }
        
        answer = Integer.parseInt(numA) + Integer.parseInt(numB);
        
        return answer;
    }
}