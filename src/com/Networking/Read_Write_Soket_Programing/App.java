package com.Networking.Read_Write_Soket_Programing;

import java.io.*;

import java.net.*;

public class App {
    public static void main(String args[])throws Exception{
        //SERVER
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("stop")){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
//CLİENT
Socket s=new Socket("localhost",3333);  
 din=new DataInputStream(s.getInputStream());  
 dout=new DataOutputStream(s.getOutputStream());  
 br=new BufferedReader(new InputStreamReader(System.in));  
  
String str3="",str4="";  
while(!str3.equals("stop")){  
str3=br.readLine();  
dout.writeUTF(str3);  
dout.flush();  
str4=din.readUTF();  
System.out.println("Server says: "+str4);  
}  
  
dout.close();  
s.close();  
}

}