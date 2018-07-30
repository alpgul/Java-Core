package com.Networking.DatagramSocket;

import java.net.*;

/*
 * Java DatagramSocket ve DatagramPacket sınıfları, bağlantısız soket programlama için kullanılır
 * Java DatagramSocket sınıfı, datagram paketleri göndermek ve almak için bağlantısız bir soketi temsil eder.
 * Bir datagram temelde bir bilgidir, ancak içeriğinin, gelişinin veya varış saatinin garantisi yoktur.
 * 
 * Kurucular:
 * DatagramSocket (), SocketException'ı atar: bir datagram soketi oluşturur ve localhost makinesindeki mevcut Port Numarası ile bağlar.
 * DatagramSocket (int bağlantınoktası), SocketEexeption öğesini atar: bir datagram soketi oluşturur ve bunu belirtilen Bağlantı Noktası Numarası ile bağlar.
 * DatagramSocket (int port, InetAddress address), SocketException'ı atar: bir datagram soketi oluşturur ve onu belirtilen port numarası ve host adresi ile bağlar.
 * 
 * DatagramPacket :
 * Java DatagramSocket sınıfı, datagram paketleri göndermek ve almak için bağlantısız bir soketi temsil eder.
 * Bir datagram temelde bir bilgidir, ancak içeriğinin, gelişinin veya varış saatinin garantisi yoktur.
 * Kurucular:
 * DatagramPacket (byte [] barr, int length): bir datagram paketi oluşturur. Bu kurucu, paketleri almak için kullanılır.
 * DatagramPacket (bayt [] barr, int uzunluk, InetAdres adresi, int bağlantınoktası): bir datagram paketi oluşturur. Bu kurucu, paketleri göndermek için kullanılır.
 */
public class App {
    public static void main(String[] args) throws Exception {
         //DatagramSocket tarafından DatagramPacket Gönderme Örneği
    DatagramSocket ds = new DatagramSocket();  
    String str = "Welcome java";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
    ds.send(dp);  
    ds.close();  
    //DatagramSocket tarafından DatagramPacket Alma Örneği
      ds = new DatagramSocket(3000);  
    byte[] buf = new byte[1024];  
     dp = new DatagramPacket(buf, 1024);  
    ds.receive(dp);  
     str = new String(dp.getData(), 0, dp.getLength());  
    System.out.println(str);  
    ds.close();  
  }
   
    
}
