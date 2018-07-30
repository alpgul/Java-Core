package com.JAVA_I_O.DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Java DataOutputStream Sınıfı:
 * Java DataOutputStream sınıfı , bir uygulamanın ilkel Java veri türlerini 
 * çıktı akışına makineden bağımsız bir şekilde yazmasına izin verir. 
Metodları:

int size()	Veri çıktı akışına yazılan bayt sayısını döndürmek için kullanılır.
void write(int b)	Belirtilen baytı  çıktı akışına yazmak için kullanılır.
void write(byte[] b, int off, int len)	Çıkış akışına veri baytlarını yazmak için kullanılır.
void writeBoolean(boolean v)	Boole değerini çıkış akışına 1 baytlık bir değer olarak yazmak kullanılır.
void writeChar(int v)	Çıkış akışına 2 baytlık bir değer olarak char yazmak için kullanılır.
void writeChars(String s)	Çıkış akışına string dizi karakteri yazmak için kullanılır.
void writeByte(int v)	Çıkış akışına 1 baytlık bir değer olarak bir bayt yazmak için kullanılır.
void writeBytes(String s)	Çıkış akışına bir dizi bayt dizisi yazmak için kullanılır.
void writeInt(int v)		Çıkış akışına bir int yazmak için kullanılır
void writeShort(int v)		Çıkış akışına short veri yazmak için kullanılır.
void writeLong(long v)	Çıkış akışına long veri yazmak için kullanılır.
void writeUTF(String str)	UTF-8 kodlaması kullanılarak çıktı akışına bir dize yazmak için kullanılır.
void flush()	butun verinizi bir anda yazmaya zorlar
 */
public class App {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}
