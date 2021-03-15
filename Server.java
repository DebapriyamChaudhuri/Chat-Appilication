package q9;

import java.net.*;
import java.io.*;
class Server 
{
	public static void main(String[] args) 
	{
		
		BufferedReader frmusr=null,frmclnt=null;
		DataOutputStream toclnt=null;
		
		try{
		ServerSocket ss=new ServerSocket(3600);
		System.out.print("\nServer Started:");
		
		while(true){
		Socket s=ss.accept();
		
		
		
		frmusr=new BufferedReader(new InputStreamReader(System.in)); 
        frmclnt=new BufferedReader(new InputStreamReader(s.getInputStream())); 
		toclnt=new DataOutputStream(s.getOutputStream());
		String str=frmclnt.readLine();
		System.out.print("\nClient :"+str);
		if(str.equals("bye"))
			break;
		System.out.print("\nServer :");
	    str=frmusr.readLine();
		toclnt.writeBytes(str+'\n');
		
		}
		}
		catch(Exception e){
		System.out.print(e);
		}
		System.out.print("\nClient Disconnected :");
	}
}
