package com.psp.javi2gar.rmiserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.psp.javi2gar.rmiinterface.RMIInterface;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface{

    private static final long serialVersionUID = 1L;

    protected ServerOperation() throws RemoteException {

        super();

    }

    @Override
    public String calc (String userOperation) throws RemoteException{    	
    	
    	double[] nums = processString.extractNumsIN(userOperation);  
    	String exit = "";
    	String message ="";
    	
    	if(userOperation.contains("+")){
    		
    		exit =String.valueOf(calculator.sum(nums));    
    		
    	}else if(userOperation.contains("-")){
    		
    		exit =String.valueOf(calculator.rest(nums));
    		
    	}else if(userOperation.contains("*")){
    		
    		exit =String.valueOf(calculator.mult(nums));   	    	
    		
    	}else if(userOperation.contains("/")){
    		
    		exit =String.valueOf(calculator.div(nums));
    		
    	}   
    	
    	if(nums.length>2){
    		message="Only two operands by operation. Thanks";
    	}
    	
        System.err.println(exit + " is trying to contact!");
        return "Server says that result is : " + exit +"\n"+message;               

    }

    public static void main(String[] args){

        try {

            Naming.rebind("//localhost/MyServer", new ServerOperation());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }

    }

}

