package stringpractice;

public class reverseVow {
	public static void main(String[] args) {
		System.out.println(reverseVowels("heilulo"));
	}
	
	public static String reverseVowels(String s) {
        if(s.length()==0 || s==null) return s;
        int start=0;
        int end=s.length()-1;
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(start<end) {
        	while(start<end && !vowels.contains(chars[start]+"")) {
        		start++;
        	}
        	while(start<end && !vowels.contains(chars[end]+"")) {
        		end--;
        	}
        	
        	char temp = chars[start];
        	chars[start] = chars[end];
        	chars[end] = temp;
        	
        	start++;
        	end--;
        }
        return String.valueOf(chars);
    }
}
