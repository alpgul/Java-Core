package com.Reflection.javap;
/*
 * Javap komutu bir java sınıfını kaynak kodunu ulaşabilir.
 * Javap komutu, sınıf dosyasında bulunan alanlar, yapıcılar ve 
 * yöntemler hakkında bilgi görüntüler.
 * Javap aracını kullanma örneği:
 * javap java.lang.Object  
 * Output:
Compiled from "Object.java"  
public class java.lang.Object {  
  public java.lang.Object();  
  public final native java.lang.Class<?> getClass();  
  public native int hashCode();  
  public boolean equals(java.lang.Object);  
  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;  
  public java.lang.String toString();  
  public final native void notify();  
  public final native void notifyAll();  
  public final native void wait(long) throws java.lang.InterruptedException;  
  public final void wait(long, int) throws java.lang.InterruptedException;  
  public final void wait() throws java.lang.InterruptedException;  
  protected void finalize() throws java.lang.Throwable;  
  static {};  
}  
 */
public class App {
    public static void main(String args[]){  
System.out.println("hello java");  
} 
}
/*
 * javap App
 * Output:
Compiled from ".java"  
class App {  
  App();  
  public static void main(java.lang.String[]);  
}  

javap -c komutu:
Java bayt kodunu yansıtan kod.
Compiled from ".java"  
class App {  
  App();  
    Code:  
       0: aload_0         
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V  
       4: return          
  
  public static void main(java.lang.String[]);  
    Code:  
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;  
       3: ldc           #3                  // String hello java  
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V  
       8: return          
}  


Javap seçenekleri:
-help	yardım mesajını yazdırır.
-l	satır numarası ve yerel değişken yazdırır
-c	kaynak kodu alma
-s	iç tip imzayı yazdırır
-sysinfo	sistem bilgilerini gösterir (yol, boyut, tarih, MD5 hash)
-constants	statik final sabitleri gösterir
-version	sürüm bilgilerini gösterir
 */
