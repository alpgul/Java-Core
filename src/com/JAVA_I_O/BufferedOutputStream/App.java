package com.JAVA_I_O.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 * BufferedOutputStream Sınıfı:
 * Java BufferedOutputStream Sınıfı
 * Java BufferedOutputStream sınıfı , bir çıkış akışının tamponlanması için kullanılır. 
 * Verileri depolamak için dahili olarak arabellek kullanır
 * Verileri doğrudan bir akışa yazmaktan daha fazla verimlilik katıyor.
 * Yani, performansı hızlı hale getirir.
 * Sözdizilimi:    
 * OutputStream os= new BufferedOutputStream(new FileOutputStream("D:\\IO Package\\testout.txt")); 
 * 
 * BufferedOutputStream Constructors:
 * BufferedOutputStream(OutputStream os)	Verileri belirtilen kullanılan veri çıktı akışına yazmak için  yeni tamponlanmış veri çıktı akışını oluşturur.
 * BufferedOutputStream(OutputStream os, int size)  Belirtilen size tampon boyutuna sahip veriyi belirtilen veri çıktı akışına yazmak için kullanılan yeni tamponlanmış veri çıktı akışını yaratır.
 * 
 * BufferedOutputStream Metodları:
 * void write(int b)	Belirtilen baytı tamponlanmış veri çıktı akışına yazar.
 * void write(byte[] b, int off, int len)	Belirtilen bayt dizisinden, belirtilen ofset dizisinden başlayarak belirtilen bayt uzunluğu kadar bayt yazar.
 * void flush() //Tamponlu çıktı akışını temizler.
 */
public class App {
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to javaTpoint.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}       
}
