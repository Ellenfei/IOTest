package netty;

import java.io.IOException;
import java.net.ServerSocket;

public class TimeServer {
	public static void main(String args[]){
		int port = 8080;
		if(args != null && args.length > 0){
			port = Integer.valueOf(args[0]);
		}
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			System.out.println("Time server starts in port:"+port);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
