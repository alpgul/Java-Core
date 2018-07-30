package com.Networking.HttpURLConnection;

import java.net.*;

/*
 * Sadece HTTP protokolü için çalışır.
 * HttpURLConnection sınıfının yardımıyla, başlık bilgileri, durum kodu, yanıt kodu vb. 
 * Herhangi bir HTTP URL'si hakkında bilgi alabilirsiniz.
 * Java.net.HttpURLConnection, URLConnection sınıfının alt sınıfıdır.
 */
public class App {
    public static void main(String[] args){    
try{    
URL url=new URL("http://www.google.com/java-tutorial");    
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
for(int i=1;i<=8;i++){  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e){System.out.println(e);} }}   