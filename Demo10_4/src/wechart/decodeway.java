package wechart;

public class decodeway {
	public static void main(String[] args) {
		System.out.println(numDecodings("17"));
	}
	
	public static int numDecodings(String s) {
        if(s.length()==0 || s==null || s.charAt(0)=='0') return 0;
        if(s.length() == 1) return 1;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<n+1; i++) {
        	dp[i] = dp[i-1];
        	if(s.charAt(i-1)=='0' )
        		if (s.charAt(i-2)=='1' || s.charAt(i-2)=='2')
        			dp[i] = dp[i-2];
        		else return 0;
        	else if(s.charAt(i-2) == '0'){
        		dp[i] = dp[i-1];
        		continue;
        	}
        	else if(s.charAt(i-1)<'7' && s.charAt(i-2)<'3'){
        		dp[i] += dp[i-2];
        	}
        	else if(s.charAt(i-1)>'6' && s.charAt(i-2)=='1')
        		dp[i]+=dp[i-2];
        }
        return dp[n];
        
    }
}
