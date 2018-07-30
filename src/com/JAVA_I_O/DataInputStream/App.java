package com.JAVA_I_O.DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*DataInputStream  Sınıfı:
Bir uygulamanın giriş akışından makine bağımsız bir şekilde ilkel verileri okumasına izin verir.
 * Metodları:
int read(byte[] b)		Giriş akışından bayt sayısını okumak için kullanılır.
int read(byte[] b, int off, int len)	Giriş akışından len bayt okumak için kullanılır 
int readInt()		Giriş baytlarını okumak ve int değerini döndürmek için kullanılır.
byte readByte()	Bir giriş baytını okumak ve byte geri dondurmek için kullanılır.
char readChar()	İki giriş baytını okumak ve bir char değeri döndürmek için kullanılır.
double readDouble()	Sekiz giriş baytını okumak ve bir double değer döndürmek için kullanılır.
boolean readBoolean()	bir giriş baytı okumak ve boolean değer döndürmek için kullanılır.
int skipBytes(int x)	Giriş akışından x bayt veriyi atlamak için kullanılır.
String readUTF()		UTF-8 formatı kullanılarak kodlanmış bir string okumak için kullanılır .
void readFully(byte[] b)	Giriş akışından baytları okumak ve bunları arabellek dizisine depolamak için kullanılır .read metodundan farkı read byte dizi boyutu kadar okuma yaparken readfully tambir okumayapar okuma işleminin byte sonuna kadar.
void readFully(byte[] b, int off, int len)	Giriş akışından len bayt okumak için kullanılır 
 */
public class App {
     public static void main(String[] args) throws IOException {
         //DataInputStream Orneği
    InputStream input = new FileInputStream("D:\\testout.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k+"-");  
    }  
  }  
}
