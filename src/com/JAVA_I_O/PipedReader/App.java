package com.JAVA_I_O.PipedReader;

import java.io.*;

/*
 * PipedReader sınıfı, bir kanalın içeriğini karakter akışı olarak okumak için kullanılır. 
 * Bu sınıf genellikle metni okumak için kullanılır.
 * PipedReader sınıfı farklı iş parçacıkları tarafından kullanılarak PipedWriter bağlanmalıdır.
 * 
 * Kurucular:
 * PipedReader(int pipeSize)	PipedReader oluşturur, böylece henüz bağlanmamıştır ve pipe tamponu için belirtilen pipe boyutunu kullanır.
 * PipedReader(PipedWriter src)	PipedReader oluşturur, böylece piper yazıcısı src'ye bağlanır.
 * PipedReader(PipedWriter src, int pipeSize)	PipedReader oluşturur, böylece piper yazıcısı src'ye bağlanır ve pipe tamponu için belirtilen pipe boyutunu kullanır.
 * PipedReader()	Henüz bağlanmamış bir PipedReader oluşturur.
 * 
 * Metodlar:
 * void	close()	Bu piped akışı kapatır ve akışla ilişkili herhangi bir sistem kaynağını serbest bırakır.
 * void	connect(PipedWriter src)	Bu piped okuyucunun pipe yazıcısı src'ye bağlanmasına neden olur.
 * int	read()	Bu piped akışından sonraki veriyi okuyor.
 * int	read(char[] cbuf, int off, int len)	Bu piped akışından gelen bir dizi karaktere kadar bir dizi karaktere kadar okur .
 * boolean	ready()	Bu akışın okunmaya hazır olup olmadığını söyler.
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
