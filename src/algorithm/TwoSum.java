package algorithm;

import java.util.HashMap;
import java.util.Map;

/*
 * 一个整数数组，一个目标值。
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
 * 
 * 
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].  */
 
public class TwoSum {
	public static void main(String[]args){
	 int numbers[]={3,2,4};
     twoSum(numbers, 6);
	}

  /* static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[j]==target-nums[i]){
        			return new int[]{i,j};	
        		}
        	}
			
		}
        throw new IllegalArgumentException("No two sum solution");
    }*/
	static int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}
}