import java.io.*;
import java.net.*;
import java.util.*;

class MT2018029_MT2018033_UDPClient{
	public static void main(String args[]) throws IOException
	{
		DatagramSocket ds = new DatagramSocket();
 
        InetAddress ip =InetAddress.getByName("172.16.134.1");

        Random rand=new Random();
        byte arr[]=new byte[5];
        for(int i=0;i<5;i++)
    {
    arr[i]=(byte)(rand.nextInt(100)+1);
 	

    }
    System.out.println("unsorted marks");
    for(byte x:arr)
    System.out.println(x);
DatagramPacket DpSend = new DatagramPacket(arr, arr.length,ip,1234);
 ds.send(DpSend);
System.out.println("Sorted marks");
byte buffer[]=new byte[5];
     DatagramPacket request1=new DatagramPacket(buffer,buffer.length);
    ds.receive(request1);
    
    for(byte z:buffer)
    	System.out.println(z);
    byte[] result=new byte[100];
    DatagramPacket request2=new DatagramPacket(result,result.length);
    ds.receive(request2);
    System.out.println("average is");
    System.out.println(result[0]);
    

 ds.close();
	}
}

class MT2018001_MT2018111_UDPClient2{
	public static void main(String args[]) throws IOException
	{
		DatagramSocket ds = new DatagramSocket();
 
        InetAddress ip =InetAddress.getByName("172.16.134.1");

        Random rand=new Random();
        byte arr[]=new byte[5];
        for(int i=0;i<5;i++)
    {
    arr[i]=(byte)(rand.nextInt(100)+1);
 	

    }
    System.out.println("unsorted marks");
    for(byte x:arr)
    System.out.println(x);
DatagramPacket DpSend = new DatagramPacket(arr, arr.length,ip,1234);
 ds.send(DpSend);
System.out.println("Sorted marks");
byte buffer[]=new byte[5];
     DatagramPacket request1=new DatagramPacket(buffer,buffer.length);
    ds.receive(request1);
    
    for(byte z:buffer)
    	System.out.println(z);
    byte[] result=new byte[100];
    DatagramPacket request2=new DatagramPacket(result,result.length);
    ds.receive(request2);
    System.out.println("average is");
    System.out.println(result[0]);
    

 ds.close();
	}
}

