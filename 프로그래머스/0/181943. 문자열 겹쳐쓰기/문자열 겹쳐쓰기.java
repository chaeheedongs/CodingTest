class Solution {
    public String solution(String my_string, 
                           String overwrite_string, 
                           int s) {
        String answer = "";
        
        for(int index = 0; index < my_string.length(); index ++) {
            if(s <= index && index < overwrite_string.length() + s) {
                answer = answer + overwrite_string.charAt(index - s);
                continue;
            }
            answer = answer + my_string.charAt(index);
        }
        
        return answer;
    }
}