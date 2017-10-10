package algorithms;

public class isomorphic {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("acfdd", "dbcff"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] cha = new int[256];
        for(int i=0; i<s.length(); i++){
        	if(cha[s.charAt(i)] != cha[t.charAt(i)+128]) return false;
        	cha[s.charAt(i)] = cha[t.charAt(i)+128] = i+1;
        }
        return true;
    }
}
