package q9;

import java.net.*;
import java.io.*;
class Client 
{
	public static void main(String[] args) 
	{
		
		BufferedReader frmsvr=null,frmusr=null;
		DataOutputStream tosvr=null;
		while(true){
		try{
		Socket s=new Socket("127.0.0.1",3600);
		frmusr=new BufferedReader(new InputStreamReader(System.in)); 
        frmsvr=new BufferedReader(new InputStreamReader(s.getInputStream())); 
		tosvr=new DataOutputStream(s.getOutputStream());
		
		System.out.print("\nClient :");
		String str=frmusr.readLine();
		tosvr.writeBytes(str+'\n');
		str=frmsvr.readLine();
	    System.out.print("\nServer :"+str);
        if(str.equals("Bye"))
			break;
		 
		 
		 
		}catch(Exception e){
		System.out.print(e);
		}
		}
	System.out.print("\nServer Disconnected :");
	}
}
