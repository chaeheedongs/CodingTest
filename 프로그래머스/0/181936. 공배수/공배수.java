class Solution {
    public int solution(final int number, final int n, final int m) {
        final int nResult = number % n;
        final int mResult = number % m;
        if(nResult == 0 && mResult == 0) {
            return 1;
        }
        return 0;
    }
}