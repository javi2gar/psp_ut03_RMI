package com.psp.javi2gar.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.psp.javi2gar.rmiinterface.RMIInterface;

public class ClientOperation {

	private static RMIInterface look_up;

	public static void main(String[] args)
		throws MalformedURLException, RemoteException, NotBoundException {

		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String userOperation = JOptionPane.showInputDialog("What do you need to calculate?");

		String response = look_up.calc(userOperation);
		JOptionPane.showMessageDialog(null, response);

	}

}

