package algorithms;

import java.util.HashMap;

public class wordPatternHS {
	public static void main(String[] args) {
		String str="dog cat cat dog";
		System.out.println(wordPattern("abbba",str));
	}
	public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(words.length != pattern.length())
        	return false;
        HashMap map = new HashMap();
        //HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for(int i=0; i<words.length; i++){
	        if(map.put(words[i], i) != map.put(pattern.charAt(i),i)) 
	        	return false;   
        }
        return true;
    }
}
