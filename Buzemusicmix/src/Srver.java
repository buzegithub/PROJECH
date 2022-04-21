
import java.rmi.*;

public class Srver{
    public static void main(String args[]){
    try{
        MInterface stub=new MRemote();
        Naming.rebind("rmi://localhost:53041/MUSIC",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
