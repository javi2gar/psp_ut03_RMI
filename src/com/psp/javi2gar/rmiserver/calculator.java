package com.psp.javi2gar.rmiserver;

public class calculator {
	
	private static double result;	
		
	public static double sum (double[] nums){
		result=nums[0]+nums[1];
		return result;		
	}
	
	public static double rest(double[] nums){
		result=nums[0]-nums[1];
		return result;		
	}
	
	public static double mult(double[] nums){
		result=nums[0]*nums[1];
		return result;		
	}
	
	public static double div(double[] nums){
		result=nums[0]/nums[1];
		return result;		
	}

}
