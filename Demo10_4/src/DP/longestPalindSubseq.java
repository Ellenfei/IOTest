package DP;
/*332/523/108/106/301/515/130/513/101/542/107/242/472/96
 * 516. Longest Palindromic Subsequence
 * ������DP
 * ��������dp[n][n]��dp[i][j]��ʾs���±�i~j�Ļ��Ĵ��ĳ���
 * ���s.charAt(i)==s.charAt(j)---> dp[i][j]=dp[i+1][j-1]+2
 * ����---> dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1])
 */
public class longestPalindSubseq {
	public static void main(String[] args) {
		String s = "bbbab";
		System.out.println(longestPalindromeSubseq(s));
	}
	public static int longestPalindromeSubseq(String s) {
		if(s==null || s.length()==0) return 0;
        int len = s.length();
		int[][] dp = new int[len][len];
		for(int i=0; i<len; i++) {
			dp[i][i] = 1;
		}
		
		for(int j=1; j<len; j++) {
			for(int i=j-1; i>=0; i--) {
				if(s.charAt(i) == s.charAt(j)) {
					dp[i][j] = i+1<=j-1 ? dp[i+1][j-1]+2 : 2;
				} else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
				}
			}
		}
		return dp[0][len-1];
    }
}
