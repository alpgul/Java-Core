package com.Serialization.Transient;

import java.io.*;

/*
 * Java geçici anahtar sözcüğü serileştirmede kullanılır. 
 * Herhangi bir veri üyesini geçici olarak tanımlarsanız, serileştirilmeyecektir.
 * Örnek alalım, bir öğrenciyi Öğrenci olarak ilan ettim, üç veri üyesi kimliği, adı ve yaşı var. 
 * Eğer nesneyi serileştirirseniz, tüm değerler serileştirilecek, ancak bir değeri serileştirmek istemiyorum, örneğin yaştan sonra yaş veri üyesini geçici olarak ilan edebiliriz.
 */
public class App {
     public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi",22);//creating object  
  //writing object into file  
  FileOutputStream f=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(f);  
  out.writeObject(s1);  
  out.flush();  
  
  out.close();  
  f.close();  
  System.out.println("success");  
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age);  
  in.close();
  //211 ravi 0
  //Gördüğünüz gibi, öğrencinin baskı yaşı 0 değerini döndürür çünkü yaş değeri serileştirilmemiştir.
 } 
}
class Student implements Serializable{  
 int id;  
 String name;  
 transient int age;//Now it will not be serialized  
 public Student(int id, String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
 }  
}  