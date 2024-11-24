import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int index = 0; index < a.length(); index = index + 1) {
            System.out.println(a.charAt(index));
        }
    }
}