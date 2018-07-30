package com.Serialization.ObjectInputStream;

import java.io.*;

/*
 * Bir ObjectInputStream, bir ObjectOutputStream kullanılarak yazılmış nesneleri ve ilkel verileri 
 * deserialize eder.
 * Metodlar:
 * 1) public final Object readObject() throws IOException, ClassNotFoundException{}	Giriş akışından bir nesne okur.
 * 2) public void close() throws IOException {}	ObjectInputStream öğesini kapatır.
 */
public class App {
    public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);  
  
  in.close();  
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