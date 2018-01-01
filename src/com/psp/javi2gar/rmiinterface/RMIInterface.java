package com.psp.javi2gar.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public String calc (String userOperation) throws RemoteException;

}
