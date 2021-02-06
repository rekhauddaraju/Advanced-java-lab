package net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ServerSocket ss=new ServerSocket(2999);
		System.out.println("Server is ready for clients");
		Socket client=ss.accept();
		
		DataInputStream din=new DataInputStream(client.getInputStream());
		PrintStream pw=new PrintStream(client.getOutputStream());
		
		
		System.out.println("Client : "+din.readLine());
		
		pw.println("Server's date and time :"+new Date().toString());
		
		client.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
