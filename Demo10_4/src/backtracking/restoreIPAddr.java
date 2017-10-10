package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * 93. Restore IP Addresses
 * Solution: DFS
 * 1.�ݹ鶨�壺 dfs(ip,result,start,restored,count)
 * 2.ip---��Ŀ�������ַ���
 *   result---���Ľ��
 *   start---��ʼ���±�
 *   restored---��Ч���ַ���
 *   count---��.���ĸ���
 * 3.��Ч��ip��A��IP�� 0.0.0.0 ��127.255.255.255 (0�κ�127�β�ʹ��)    
 * 			B��IP�� 128.0.0.0 ��191.255.255.255    
 * 			C��IP�� 192.0.0.0 ��223.255.255.255
 * 4.�ݹ������������1��count>4--->�˷ָ���Ч��ip��ַ
 * 			       ��2��count==4 && start==ip.length--->�˷ָ���Ч��ip��ַ
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
