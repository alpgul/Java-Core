package com.JAVA_I_O.BufferedWriter;

import java.io.*;

/*
 * Java BufferedWriter sınıfı, Writer örneklerinin arabelleğe alınmasını sağlamak için kullanılır. 
 * Performansı hızlı yapar. Writer sınıfını miras alır . 
 * Tamponlama karakterleri, tek dizilerin , karakterlerin ve dizelerin verimli yazılmasını sağlamak için kullanılır .
 * 
 * Kurucular:
 * BufferedWriter(Writer wrt)	Bir çıktı arabelleği için varsayılan boyutu kullanan bir tamponlanmış karakter çıktı akışı oluşturmak için kullanılır.
 * BufferedWriter(Writer wrt, int size)	Bir çıktı arabelleği için belirtilen boyutu kullanan bir tamponlanmış karakter çıktı akışı oluşturmak için kullanılır.
 * 
 * Metodlar:
 * void newLine()	Bir satır ayırıcı yazarak yeni bir satır eklemek için kullanılır.
 * void write(int c)	Tek bir karakter yazmak için kullanılır.
 * void write(char[] cbuf, int off, int len)	Bir dizi karakterin bir kısmını yazmak için kullanılır.
 * void write(String s, int off, int len)	Bir String ifadenin bir kısmını yazmak için kullanılır.
 * void flush()	Giriş akışını temizlemek için kullanılır.
 * void close()	Giriş akışını kapatmak için kullanılır
 */
public class App {
    public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}
