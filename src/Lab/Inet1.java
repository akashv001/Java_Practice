package Lab;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class Inet1 {
    public static void main(String[] args) {
        String name = "";
        try {
            System.out.println("HOSTNAME-Numeric Address:" + InetAddress.getLocalHost());
            InetAddress ip = InetAddress.getByName(name);
            System.out.println("HOSTDEFAULT-NAME/IP:" + ip);
            System.out.println("HOSTIP-ADDRESS:" + ip.getHostAddress());
            System.out.println("HOSTDEFAULT-NAME:" + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("NotfindtheIP-ADDRESSfor:" + name);
        }
    }
}