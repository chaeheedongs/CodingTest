import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int index = 0; index < a.length(); index++) {
            int intString = a.charAt(index);
            if(intString > 96) {
                intString = intString - 32;
            } else {
                intString = intString + 32;
            }
            result = result + (char) intString;
        }
        
        System.out.println(result);
        
        sc.close();
    }
}