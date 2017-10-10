package dividealgorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * 282. Expression Add Operators
 * ˼·:
��ΪҪ������п��ܵ�������ض����������������������������ν������ֳɶ���������Ӽ����ܺô���ÿ�����ǽس�һ������ʱ��
��֮ǰ����Ľ�����ϻ��߼�ȥ��������Ϳ��Խ�ʣ��������ַ������µļ�����������һ���������ˣ�ֱ�����ǵļ�������Ŀ��һ����
�������һ��������Ȼ�����˷���δ����أ�����������Ҫ��һ��������¼�˷���ǰ�۳˵�ֵ��ֱ���۳����ˣ�������һ���ӺŻ�����ٽ���
����������С��������������:

1.�˺�֮ǰ�ǼӺŻ���ţ�����2+3*4��������2����������Ľ������3��ʱ������3����������Ϊ5���ڵ�4��ʱ����Ϊ4֮ǰ
����ѡ����ǳ˺ţ�����3��Ӧ�ú�4��ˣ������Ǻ�2��ӣ������ڼ�����ʱ��Ҫ��5�ȼ�ȥ�ղżӵ�3�õ�2��Ȼ���ټ���3����4���õ�2+12=14��
����14���ǵ�4Ϊֹʱ�ļ�������
2.����һ������ǳ˺�֮ǰҲ�ǳ˺ţ����2+3*4*5���������ǵ�4Ϊֹ����Ľ����14�ˣ�Ȼ�����ǵ�5��ʱ�����ǳ˺ţ���ʱ������Ҫ�Ѹղ�
�ӵ�3*4��ȥ����Ȼ���ټ���3*4*5��Ҳ����14-3*4+3*4*5=62������5�ļ���������62��

��ΪҪ����������������������Ҫ��ô����������һ���Ǽ�¼�ϴεļ�����currRes��һ���Ǽ�¼�ϴα��ӻ��߱�������prevNum��һ���ǵ�ǰ
׼���������currNum������һ�������ǼӼ���ʱ��prevNum���Ǽ򵥻���currNum������һ�������ǳ˷�ʱ��prevNum��prevNum����
currNum��

ע��
��һ������������������ֻ������֣��Ͳ������+1+2���ֱ��ʽ�ˡ�
���ǽس������ֲ��ܰ���0001����ǰ����0�����֣�����һ��0�ǿ��Եġ�����һ���س�������ǰ��Ϊ0���Ϳ���return�ˣ���Ϊ˵��ǰ��ͽصĲ��ԣ�
����֮���ǿ�ʼΪ0�ģ�����Ҳ�������ˡ�
���Ӷ�:ʱ�� O(N^2) �ռ� O(N)
 */
public class addExpression {
	public static void main(String[] args) {
		System.out.println(addOperators("123", 6));
	}
	public static List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        if(num==null || num.length()==0)
        	return res;
        helper(res, num, target, "", 0, 0);
        return res;
        
    }
	public static void helper(List<String> res, String num, int target, String path, 
			 long curRes, long prevNum) {
		if(curRes==target && num.length()==0) {
			String exp = new String(path);
			res.add(exp);
			return;
		}
		//�������п��ܵĲ�ֽ��
		for(int i=1; i<=num.length(); i++) {
			String curStr = num.substring(0,i);
			// ����ǰ��Ϊ0���������ų� 
			if(curStr.length()>1 && curStr.charAt(0)=='0') return;
			// �õ���ǰ�س�����  
			long curNum = Long.parseLong(curStr);
			// ȥ����ǰ�������õ���һ�������õ��ַ��� 
			String next = num.substring(i);
			// ������ǵ�һ����ĸʱ�����Լ������������ֻ������ 
			if(path.length()==0) {
				helper(res, next, target, curStr, curNum, curNum);
			} else {
				//+
				helper(res, next, target, path+"+"+curNum, curRes+curNum, curNum);
				//-
				helper(res, next, target, path+"-"+curNum, curRes-curNum, -curNum);
				//*
				helper(res, next, target, path+"*"+curNum, (curRes-prevNum)+prevNum*curNum,
						prevNum*curNum);

			}
		}
	}
}
