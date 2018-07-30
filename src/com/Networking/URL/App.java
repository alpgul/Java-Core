package com.Networking.URL;

import java.net.URL;

/*
 * Java URL sınıfı bir URL'yi gösterir. 
 * URL, Tekdüzen Kaynak Konum Belirleyicisi için bir kısaltmadır.
 *  World Wide Web'deki bir kaynağa işaret eder.
 * Protokol: Bu durumda, protokol proto.
 * Sunucu adı veya IP Adresi: Sunucu adıdır.
 * Bağlantı Noktası Numarası: İsteğe bağlı bir özelliktir.  URL'de port numarası belirtilmediyse, -1 değerini döndürür.
 * Dosya Adı veya dizin adı: Bu durumda, index.jsp dosya adıdır.
 * Metodlar:
 * public String getProtocol()	URL protokolünü döndürür.
 * public String getHost()	URL'nin ana bilgisayar adını döndürür.
 * public String getPort()	URL'nin Port Numarası'nı döndürür.
 * public String getFile()	URL'nin dosya adını döndürür.
 * public URLConnection openConnection()	Bu URL ile ilişkili URLConnection örneğini döndürür.
 */
public class App {
    public static void main(String[] args){  
try{  
URL url=new URL("http://www.google.com/java-tutorial");  
  
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("File Name: "+url.getFile());  
  
}catch(Exception e){System.out.println(e);}  
} 
}
