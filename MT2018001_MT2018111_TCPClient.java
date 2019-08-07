import java.io.*;
import java.net.*;
import java.util.*;

class MT2018001_MT2018111_TCPClient{
	public static void main(String args[]) throws IOException{
Socket c=new Socket("192.168.43.65",1254);

DataInputStream dis=new DataInputStream(c.getInputStream());
DataOutputStream dos=new DataOutputStream(c.getOutputStream());

Random rand=new Random();
 for(int i=0;i<5;i++)
 {
 	
 	dos.writeInt(rand.nextInt(100)+1);
 }
 int a;
 System.out.println("marks are:");
 for(int i=0;i<5;i++)
 {
 	a=dis.readInt();
 	System.out.println(a);
}
System.out.println("average is:");
System.out.println(dis.readFloat());
 dis.close();
 dos.close();
 c.close();

	}
}
