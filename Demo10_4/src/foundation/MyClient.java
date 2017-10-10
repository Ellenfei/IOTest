package foundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 多线程客户端
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1",3000);
		new Thread(new ClientThread(s)).start();
		PrintStream ps = new PrintStream(s.getOutputStream());
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while((line=br.readLine())!=null) {
			ps.print(line);
		}
	}
}

class ClientThread implements Runnable {
	private Socket s = null;
	BufferedReader br = null;
	public ClientThread(Socket s) throws IOException {
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String content = null;
		try {
			while((content=br.readLine())!=null) {
				System.out.println(content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
