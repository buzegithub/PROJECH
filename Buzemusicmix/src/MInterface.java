import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

public interface MInterface extends Remote{
public void playAudio(String audioName)throws RemoteException;
}

