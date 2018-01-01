package com.psp.javi2gar.rmiserver;

public class processString {	
	
	private static String op="";	
	
	public static double[] extractNumsIN(String txt){		
		
		if( txt.contains("+") || txt.contains("-") || txt.contains("*") || txt.contains("/") ){
			
			if (txt.contains("+")){
				
				 op="\\+";
				 
			}else if (txt.contains("-")){
				
				 op="\\-";				
				 
			}else if (txt.contains("*")){				
				 op="\\*";			 
			
			}else if (txt.contains("/")){
				
				 op="\\/";
				 
			}
						
			String[] numsText;	 		
		    numsText= txt.split(op); 
		    double[]num = new double[numsText.length];	
		    
		    for(int i=0; i<numsText.length; i++){		    	
		    	num[i]=Double.valueOf(numsText[i]);
		    }      
			return num; 	
			
		}else{
			System.err.println("Server said: Oprations it`s emty!");			 	
		}		
		return null; 	 
	}	
		
}
