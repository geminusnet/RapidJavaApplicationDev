// CallBackImpl.java: The CallBack RMI interface implementation
package rmitictactoedemo;

import java.rmi.*;
import java.rmi.server.*;

public class CallBackImpl extends UnicastRemoteObject
  implements CallBack {
  // The client will be called by the server through callback
  TicTacToeClient thisClient;

  /** Constructor */
  CallBackImpl(Object client) throws RemoteException {
    thisClient = (TicTacToeClient)client;
  }

  /** The server notifies the client for taking a turn */
  public void takeTurn(boolean turn) throws RemoteException {
    thisClient.setMyTurn(turn);
  }

  /** The server sends a message to be displayed by the client */
  public void notify(java.lang.String message)
    throws RemoteException {
    thisClient.setMessage(message);
  }

  /** The server notifies a client of the other player's move */
  public void mark(int row, int column, char token)
    throws RemoteException {
    thisClient.mark(row, column, token);
  }
}