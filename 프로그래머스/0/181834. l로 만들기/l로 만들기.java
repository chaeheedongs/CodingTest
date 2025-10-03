class Solution {
    public String solution(String myString) {
        String answer = "";
        
        int compareAscii = (int) 'l';

        for (int i = 0; i < myString.length(); i++) {
            final int ascii = myString.charAt(i);
            if (compareAscii > ascii) {
                answer = answer + "l";
                continue;
            }

            answer = answer + myString.charAt(i);
        }
        
        return answer;
    }
}