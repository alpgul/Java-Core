package com.JAVA_I_O.FilterOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/*
 * FilterOutputStream Sınıfı:
 * FilterOutputStream sınıfı, tüm çıktıları temeldeki çıktı akışına ileten sürümlerle birlikte 
 * tüm OutputStream yöntemlerini geçersiz kılar.
 * Methodlar:
 * void write(int b)	It is used to write the specified byte to the output stream.
 * void write(byte[] ary)	It is used to write ary.length byte to the output stream.
 * void write(byte[] b, int off, int len)	It is used to write len bytes from the offset off to the output stream.
 * void flush()	It is used to flushes the output stream.
 * void close()	It is used to close the output stream.
 */
public class App {
     public static void main(String[] args) throws IOException {  
        File data = new File("D:\\testout.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to javaTpoint.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
}
