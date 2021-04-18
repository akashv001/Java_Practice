package Lab;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.Socket;
	import java.net.UnknownHostException;
	public class A {
	    public static void main(String[] args) {
	        System.out.println("Sending a request......");
	        try {
	            Socket s = new Socket("127.0.0.1", 1564);
	            System.out.println("connected successfuly...");
	            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	            System.out.println("esponse from server....");
	            System.out.println("client side:" + br.readLine());
	            s.close();
	        } catch (UnknownHostException e) {
	            System.out.println("Not find the IP-AdDress for:" + e);
	        } catch (IOException e) {
	            System.out.println("Not found data for Socket:" + e);
	        }
	    }
	}