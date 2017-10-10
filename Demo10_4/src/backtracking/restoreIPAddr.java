package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * 93. Restore IP Addresses
 * Solution: DFS
 * 1.递归定义： dfs(ip,result,start,restored,count)
 * 2.ip---题目给定的字符串
 *   result---最后的结果
 *   start---开始的下标
 *   restored---有效的字符串
 *   count---“.”的个数
 * 3.有效的ip：A类IP段 0.0.0.0 到127.255.255.255 (0段和127段不使用)    
 * 			B类IP段 128.0.0.0 到191.255.255.255    
 * 			C类IP段 192.0.0.0 到223.255.255.255
 * 4.递归结束条件：（1）count>4--->此分割无效的ip地址
 * 			       （2）count==4 && start==ip.length--->此分割有效的ip地址
 */
public class restoreIPAddr {
	public static void main(String[] args) {
		String s = "25525511135";
		System.out.println(restoreIpAddresses(s));
	}
	public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, result, 0, "", 0);
        return result;
    }
	public static void dfs(String ip, List<String> result, int start, 
			String restored, int count) {
		if(count>4) return;
		if(ip.length()<4 || ip.length()>12) return;
		if(count ==4 && start==ip.length()) result.add(restored);
		for(int i=1; i<4; i++) {
			if(start+i > ip.length()) break;
			String subStr = ip.substring(start, start+i);
			if(subStr.charAt(0)=='0' && subStr.length()>1 ||
					Integer.parseInt(subStr)>255) continue;
			dfs(ip, result, start+i, restored+subStr+(count==3 ? "" : "."), count+1);
		}
	}
}
