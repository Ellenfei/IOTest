package greedy;

public class gasStations {
	public static void main(String[] args) {
		int[] gas = {5};
		int[] cost = {4};
		System.out.println(canCompleteCircuit(gas, cost));
		System.out.println(maxSubSum(gas));
	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {

        int sum=0, sum1=0;
        int index = 0;
        int[] diff = new int[gas.length];
        for(int i=0; i<diff.length; i++) {
        	 diff[i] = gas[i]-cost[i];
        }
        for(int i=0; i<diff.length; i++) {
        	sum += diff[i];
        	sum1 += diff[i];
        	if(sum < 0) {  
        		sum = 0;
        		index = i+1;
        	}
        }
        if(sum1 < 0) return -1;
        return index;
    }
	
	public static int maxSubSum(int[] array) {
		int thisSum = 0;
		int maxSum = 0;
		int index = -1;
		for(int i=0; i<array.length; i++) {
			thisSum += array[i];
			if(thisSum < 0)
				thisSum = 0;
			else if(thisSum > maxSum) {
				maxSum = thisSum;
				index = i+1;
			}
		}
		return index;
	}
}
