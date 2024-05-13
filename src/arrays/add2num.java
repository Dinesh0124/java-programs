package arrays;

import java.util.Arrays;

public class add2num {
public static void main(String[] args) {
	 int n[]={2,3,4,5,1,6};
     int target=9;
     int a[]=twoSum(n,target);
     System.out.println(Arrays.toString(a));
 }
 public static int[] twoSum(int[] nums, int target) {
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             if(nums[i]+nums[j]==target){
            	 System.out.println(nums[i]+" "+nums[j]);
                 return new int [] {nums[i],nums[j]};
             }
         }
     }
	return nums ;
	
}
}
