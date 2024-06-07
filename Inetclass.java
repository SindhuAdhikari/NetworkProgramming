import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class Inetclass{
    public static void main(String[] args) throws IOException {

         try{
         System.out.println("Hello world");

        // byte[] add= new byte[] {(byte)123,(byte)343,(byte)213,(byte)123,(byte)234};
        //InetAddress address = InetAddress.getByAddress(add);

         InetAddress address = InetAddress.getByName("WWW.google.com");
         InetAddress address2[] = InetAddress.getAllByName("WWW.Facebook.com");
        
        System.out.println(address.toString());
        System.out.println(Arrays.toString(address2));

         for (int i=0; i<address2.length;i++){

         System.out.println("Address "+ (i+1)+""+ address2[i].toString());
         }
        
         System.out.println("Using getByName():" + address.toString());

         System.out.println("Canonical address" +address.getCanonicalHostName());
         System.out.println("Host address"+address.getHostAddress());
         System.out.println("Address"+address.getClass());
         System.out.println("" +address.isReachable(1000));

         }catch(UnknownHostException e){
         }
    }
}
