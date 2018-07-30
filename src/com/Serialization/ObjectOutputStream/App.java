package com.Serialization.ObjectOutputStream;

import java.io.*;

/*
 * ObjectOutputStream sınıfı, bir primitive Çıktı'ya ilkel veri türlerini ve Java nesnelerini yazmak için kullanılır. Sadece java.io.Serializable arabirimini destekleyen nesneler akışlara yazılabilir.
 * Metodlar:
 * 1) public final void writeObject(Object obj) throws IOException {}	Belirtilen nesneyi ObjectOutputStream'ye yazar.
 * 2) public void flush() throws IOException {}	mevcut çıkış akışını temizle.
 * 3) public void close() throws IOException {}	Mevcut çıkış akışını kapatır.
 */
public class App {
     public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}
 class Student implements Serializable{  
 int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  