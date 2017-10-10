package stringpractice;
/*
 *  520. Detect Capital
 *  
 *  题目大一：判断一个字母是否大小写正确：要么全是大写，要么全是小写，或者首字母大写其他小写，否则不满足要求
 *  
 *  方法：
 *  1. 用简单的判断来解决
 *  2. 用java自带的大小写转换方法和字符串的比较来解决
 *  3. 采用正则表达式来解决
 *  
 *  65～90为26个大写英文字母,97～122号为26个小写英文字母
 */
public class detectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("Leetcode"));
	}
	
	public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(char ch : word.toCharArray()) {
        	if('Z'-ch >=0) cnt++;		//大写字母的个数
        }
        return (cnt==word.length() || cnt==0 || (cnt==1 && 'Z'-word.charAt(0)>=0));
    }
}
