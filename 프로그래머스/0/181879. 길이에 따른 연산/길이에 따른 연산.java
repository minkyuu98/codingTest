class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        
        if(num_list.length >= 11){
            
            for(int i=0; i<num_list.length; i++){
                
                answer += num_list[i];

            } 
            
        }else{
            
            int a = 0;
            
            for(int i=0; i<num_list.length; i++){

                if(i==0){
                    
                    a = num_list[i];
                    
                }else{
                    
                    a *= num_list[i];
                    
                }
                
                answer = a;

            } 
            
        }
        
        
        
        
        
        return answer;
    }
}