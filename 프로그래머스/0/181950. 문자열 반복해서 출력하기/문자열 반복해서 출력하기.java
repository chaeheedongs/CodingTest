import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int index = 0; index < n; index = index + 1) {
            System.out.print(str);
        }
    }
}