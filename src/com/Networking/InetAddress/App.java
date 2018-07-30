package com.Networking.InetAddress;

import java.net.InetAddress;

/*
 * Java InetAddress sınıfı bir IP adresini temsil eder.
 * Java.net.InetAddress sınıfı herhangi konak adının IP almak için yöntemler sağlar 
 * Metodlar:
 * public static InetAddress getByName(String host) throws UnknownHostException	LocalHost IP ve adını içeren InetAddress örneğini döndürür.
 * public static InetAddress getLocalHost() throws UnknownHostException	yerel ana bilgisayar adı ve adresi içeren InetAdddress örneğini döndürür.
 * public String getHostName()	IP adresinin ana bilgisayar adını döndürür.
 * public String getHostAddress()	IP adresini dize biçiminde döndürür.
 */
public class App {
    public static void main(String[] args){  
try{  
InetAddress ip=InetAddress.getByName("www.google.com");  
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}
}
