package com.JAVA_I_O.PrintStream;

import java.io.*;

/*
 * PrintStream sınıfı, başka bir akışa veri yazmak için yöntemler sağlar.
 * PrintStream sınıfı , verileri otomatik olarak temizler, 
 * böylece flush () yöntemini çağırmaya gerek yoktur. Üstelik, yöntemleri IOException'ı atmaz.
 * Sınıf FilterOutputStream'den türetilmiştir 
 * Herhangi bir veriyi herhangi bir çıktı akışına taşımak için kullanılabilir.
 * Bayt cinsinden veri yazmak için kullanılır
 * PrintStream bir bayt akıştır
 * PrintStream , bir platformdan diğerine geçerken bazen sorunlara neden olan 
 * platform bağımlılığı sorunlarını artıran , platform bağımlı karakter kodlamasını kullanır 
 * 
 * Metodlar:
 * void print(boolean b)	Belirtilen boolean değerini yazdırır.
 * void print(char c)	Belirtilen char değerini yazdırır.
 * void print(char[] c)	Belirtilen karakter dizisi değerlerini yazdırır .
 * void print(int i)	Belirtilen int değerini yazdırır.
 * void print(long l)	Belirtilen long değeri yazdırır.
 * void print(float f)	Belirtilen float değerini yazdırır.
 * void print(double d)	Belirtilen double değeri yazdırır.
 * void print(String s)	Belirtilen String değerini yazdırır .
 * void print(Object obj)	Belirtilen nesne değerini yazdırır.
 * void println(boolean b)	Belirtilen boolean değerini yazdırır ve satırı sonlandırır.
 * void println(char c)	Belirtilen char değerini yazdırır ve satırı sonlandırır.
 * void println(char[] c)	Belirtilen karakter dizisi değerlerini yazdırır ve satırı sonlandırır.
 * void println(int i)	Belirtilen int değerini yazdırır ve satırı sonlandırır.
 * void println(long l)	Belirtilen long değeri yazdırır ve satırı sonlandırır.
 * void println(float f)	Belirtilen float değerini yazdırır ve satırı sonlandırır.
 * void println(double d)	Belirtilen double değeri yazdırır ve satırı sonlandırır.
 * void println(String s)	Belirtilen String değerini yazdırır ve satırı sonlandırır.
 * void println(Object obj)	Belirtilen nesne değerini yazdırır ve satırı sonlandırır.
 * void println()	Sadece satırı sonlandırır.
 * void printf(Object format, Object... args)	Biçimlendirilmiş dizgiyi geçerli akışa yazar.
 * void printf(Locale l, Object format, Object... args)	Biçimlendirilmiş dizgiyi geçerli akışa yazar.
 * void format(Object format, Object... args)	Biçimlendirilmiş dizeyi belirtilen formatı kullanarak geçerli akışa yazar.
 * void format(Locale l, Object format, Object... args)	Biçimlendirilmiş dizeyi belirtilen formatı kullanarak geçerli akışa yazar.
 */
public class App {
    public static void main(String args[])throws Exception{    
   FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");    
   PrintStream pout=new PrintStream(fout);    
   pout.println(2016);    
   pout.println("Hello Java");    
   pout.println("Welcome to Java");    
   pout.close();    
   fout.close();    
  System.out.println("Success?");    
  
  //Java PrintStream sınıfını kullanarak printf () yönteminin örneği:
  int a=19;    
   System.out.printf("%d",a); //Note: out is the object of printstream    
 }    
}
