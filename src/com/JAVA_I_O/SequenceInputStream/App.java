package com.JAVA_I_O.SequenceInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*Java SequenceInputStream Sınıfı:
 * birden çok veri akış nesenesinden veri okumak için kullanılır

Kurucular:
SequenceInputStream(InputStream s1, InputStream s2)	Sırasıyla iki veri giriş akışının verilerini okuyarak, ilk s1 ve ardından s2'yi okuyarak yeni bir veri giriş akışı oluşturur.
SequenceInputStream(Enumeration e) türü InputStream olan bir numaralandırma verisini okuyarak yeni bir veri giriş akışı oluşturur.

Metodlar:
int read()	Giriş akışından sonraki veri baytını okumak için kullanılır.
int read(byte[] ary, int off, int len)	Giriş akışından bayt dizisine veri baytlarının okunması için kullanılır .
int available()	Bir giriş akışından okunabilecek maksimum bayt sayısını döndürmek için kullanılır.
void close()	Giriş akışını kapatmak için kullanılır.
 */
public class App {
    public static void main(String[] args) throws IOException {
        //Java SequenceInputStream Örneği
        FileInputStream input1=new FileInputStream("D:\\testin.txt");    
   FileInputStream input2=new FileInputStream("D:\\testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();   
   
   //Java SequenceInputStream Örneği 2 Enumeration kullanarak verileri okuyan SequenceInputStream örneği
   //creating the FileInputStream objects for all the files    
FileInputStream fin=new FileInputStream("D:\\a.txt");    
FileInputStream fin2=new FileInputStream("D:\\b.txt");    
FileInputStream fin3=new FileInputStream("D:\\c.txt");    
FileInputStream fin4=new FileInputStream("D:\\d.txt");    
//creating Vector object to all the stream    
Vector v=new Vector();    
v.add(fin);    
v.add(fin2);    
v.add(fin3);    
v.add(fin4);              
//creating enumeration object by calling the elements method    
Enumeration e=v.elements();      
//passing the enumeration object in the constructor    
SequenceInputStream bin=new SequenceInputStream(e);    
int i=0;      
while((i=bin.read())!=-1){    
System.out.print((char)i);    
}     
bin.close();    
fin.close();    
fin2.close();  
    }
}
