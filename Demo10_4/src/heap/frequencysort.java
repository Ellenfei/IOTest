package heap;
//Õ∞≈≈–Ú
public class frequencysort {
	public static void main(String[] args) {
		System.out.println(frequencySort("aabbffbffdeee"));
	}
	
	public static String frequencySort(String s) {
        if(s.length() < 3)
        	return s;
        int[] map = new int[256];
        int max = 0;
        for(char ch : s.toCharArray()) {
        	map[ch]++;
        	max = Math.max(max, map[ch]);
        }
        
        String[] buckets = new String[max+1];
        for(int i=0; i<256; i++) {
        	String str = buckets[map[i]];
        	if(map[i]>0) {
        		buckets[map[i]] = str==null ? ""+(char)i : str+(char)i;
        	}
        }
        for(String s1 : buckets){
        	System.out.println(s1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=max; i>0; i--) {
        	if(buckets[i] != null) {
        		for(char ch : buckets[i].toCharArray()) {
        			for(int j=0; j<i; j++)
        				sb.append(ch);
        		}
        	}
        }
        return sb.toString();
    }
}
