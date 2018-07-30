package com.JAVA_I_O.FileOutputStream;
import java.io.FileOutputStream;
/*
 * FileOutputStream Sınıfı:
 * Java FileOutputStream, bir dosyaya veri yazmak için kullanılan bir çıkış akışıdır.
 * Karakter odaklı veri yazabilirsiniz. 
 * Ancak, karakter odaklı veriler için FileWriter'in FileOutputStream'den daha çok kullanılması 
 * tercih edilir.
 * 
 * Metodları:
 * protected void finalize()	Dosya çıkış akışı ile bağlantıyı temizlemer
 * void write(byte[] ary)	Bayt dizisinden dosya çıktı akışına boyutu kadar bayt yazmak için kullanılır .
 * void write(byte[] ary, int off, int len)	off ile belirtilen byte dan başlayarak len uzunluğunda yazar
 * void write(int b)	tek bir byte yazar
 * FileChannel getChannel()		Dosya çıkış akışıyla ilişkili dosya kanalı nesnesini döndürmek için kullanılır.
 * FileDescriptor getFD()	Veri Akışıyla ilişkilendirilmiş dosya tanıtıcısını döndürmek için kullanılır.
 * void close()    Dosya çıkış akışını kapatmak için kullanılır.
 */
public class App {
public static void main(String args[]){
    //Java FileOutputStream Örnek 1:
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}
            
    //Java FileOutputStream Örnek 2:
      try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}  
      }
}
