/*
 * Date:2016/7/23
 * Name:Wangfei
 * Demo:CharSequence½Ó¿ÚÁ·Ï°
 */
package NInterfaceTest;
class Text implements CharSequence{
	String cs="123How wonderful a day...456";

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return cs.charAt(index);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return cs.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return cs.subSequence(start, end);
	}


}
public class CharSequenceDemo {
	public static void main(String[] args){
		Text t=new Text();	
		System.out.println(t.charAt(2));
		System.out.println(t.length());
		System.out.println(t.subSequence(3,t.length()-3));
	}

}
