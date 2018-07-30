package com.JAVA_I_O.PipedWriter;

import java.io.*;

/*
 * PipedWriter sınıfı, java karakter akışı olarak yazmak için kullanılır . 
 * Bu sınıf genellikle yazı yazmak için kullanılır. 
 * Genel olarak PipedWriter ile PipedReader farklı threadler tarafından bağlanılır.
 * 
 * Kurucular:
 * PipedWriter()	Henüz bir pipe okuyucuya bağlı olmayan bir piper yazarı oluşturur.
 * PipedWriter(PipedReader snk)	Belirtilen pipeyi okuyucuya bağlı bir pipe yazar oluşturur.
 * 
 * Metodlar:
 * void	close()	Bu pipetlenmiş çıktı akışını kapatır ve bu akışla ilişkili herhangi bir sistem kaynağını serbest bırakır.
 * void	connect(PipedReader snk)	Bu pipo yazarını bir alıcıya bağlar.
 * void	flush()	Bu çıktı akışını temizler ve herhangi bir tamponlanmış çıktı karakterinin yazılmasını zorlar.
 * void	write(char[] cbuf, int off, int len)	Belirtilen karakter dizisindeki len karakterleri, bu pipetlenmiş çıktı akışına offset olarak başlayarak yazar .
 * void	write(int c)	Belirtilen char'i pipetlenmiş çıktı akışına yazar.
 */
public class App {
      public static void main(String[] args) {  
        try {  
  
            final PipedReader read = new PipedReader();  
            final PipedWriter write = new PipedWriter(read);  
  
            Thread readerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        int data = read.read();  
                        while (data != -1) {  
                            System.out.print((char) data);  
                            data = read.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            Thread writerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        write.write("I love my country\n".toCharArray());  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
  
    }  
}
