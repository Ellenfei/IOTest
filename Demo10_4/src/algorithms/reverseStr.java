package algorithms;

public class reverseStr {
	public static void main(String[] args) {
		String s = "hello";
		//char[] ch2 = s.toCharArray();
		//System.out.println(ch2.toString());
		System.out.println(s);
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
        //String result;
        char c[] = s.toCharArray();
        for(int i=0; i<c.length/2; i++) {
        	char ch;
        	ch = c[i];
        	c[i] = c[c.length-1-i];
        	c[c.length-1-i] = ch;       	
        }
        return  String.valueOf(c);
    }
}
