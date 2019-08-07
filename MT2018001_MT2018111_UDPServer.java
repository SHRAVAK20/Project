import java.io.*;
import java.net.*;
import java.util.*;

class MT2018001_MT2018111_UDPServer{
	public static void main(String args[]) throws IOException
	{
    DatagramSocket ds = new DatagramSocket(1234);
    byte[] bufferre=new byte[5];
    DatagramPacket request=new DatagramPacket(bufferre,bufferre.length);
    ds.receive(request);
    

    Arrays.sort(bufferre);
    for(byte x: bufferre)
    System.out.println(x);
    DatagramPacket response1=new DatagramPacket(bufferre,bufferre.length,request.getAddress(),request.getPort());
    ds.send(response1);
    int sum=0;
for(int i=0;i<5;i++)
	sum=sum+bufferre[i];
 byte[] avg=new byte[100];
 avg[0]=(byte)(sum/5);
 System.out.println(avg[0]);
    DatagramPacket response2=new DatagramPacket(avg,avg.length,request.getAddress(),request.getPort());
    ds.send(response2);

   ds.close();


	}}

class MT2018001_MT2018111_UDPServer2{
	public static void main(String args[]) throws IOException
	{
    DatagramSocket ds = new DatagramSocket(1234);
    byte[] bufferre=new byte[5];
    DatagramPacket request=new DatagramPacket(bufferre,bufferre.length);
    ds.receive(request);
    

    Arrays.sort(bufferre);
    for(byte x: bufferre)
    System.out.println(x);
    DatagramPacket response1=new DatagramPacket(bufferre,bufferre.length,request.getAddress(),request.getPort());
    ds.send(response1);
    int sum=0;
for(int i=0;i<5;i++)
	sum=sum+bufferre[i];
 byte[] avg=new byte[100];
 avg[0]=(byte)(sum/5);
 System.out.println(avg[0]);
    DatagramPacket response2=new DatagramPacket(avg,avg.length,request.getAddress(),request.getPort());
    ds.send(response2);

   ds.close();


	}}
