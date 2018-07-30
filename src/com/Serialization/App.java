package com.Serialization;

import java.io.Serializable;

/*
 * Esas olarak ağdaki nesnenin durumunu gezmek için kullanılır (marshaling olarak bilinir).
 * Genellikle Hazırda, RMI, JPA, EJB ve JMS teknolojilerinde kullanılır.
 * Seri hale getirilebilir bir işaretçi arayüzüdür (veriye ve yönteme sahip değildir). Java sınıflarını "işaretlemek" için kullanılır, böylece bu sınıfların nesneleri belirli bir yetenek kazanabilir. Cloneable ve Remote da işaretçi arayüzleridir.
 * Nesnesini devam ettirmek istediğiniz sınıf tarafından uygulanmalıdır.
 * String sınıfı ve tüm sarmalayıcı sınıfları , varsayılan olarak java.io.Serializable arabirimini uygular .
 * 
 */
public class App {
}

class Student implements Serializable{  
 int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 
//Kalıtım ile Java Serileştirme (IS-A İlişki)
class Person implements Serializable{  
 int id;  
 String name;  
 Person(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  
class Student1 extends Person{  
 String course;  
 int fee;  
 public Student1(int id, String name, String course, int fee) {  
  super(id,name);  
  this.course=course;  
  this.fee=fee;  
 }  
}  
//Toplama ile Java Serileştirme (HAS-A İlişki)
//Bir nesnenin içindeki tüm nesneler Seri hale getirilebilir olmalıdır.
/*
 * Eğer bir sınıf başka bir dersin referansına sahipse, tüm referanslar Seri hale getirilebilir olmalı
 * aksi halde serileştirme işlemi yapılmayacaktır. 
 * Böyle bir durumda, çalışma zamanında NotSerializableException atılır.
 */
class Address1{  
 String addressLine,city,state;  
 public Address1(String addressLine, String city, String state) {  
  this.addressLine=addressLine;  
  this.city=city;  
  this.state=state;  
 }  
}  
 class Student3 implements Serializable{  
 int id;  
 String name;  
 Address1 address;//HAS-A  
 public Student3(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 

/*
 * Bir sınıfta herhangi bir statik veri üyesi varsa, statik değil sınıf nesnenin bir parçası olduğu için serileştirilmeyecektir.
 */
class Employee implements Serializable{  
 int id;  
 String name;  
 static String company="SSS IT Pvt Ltd";//it won't be serialized  
 public Employee(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 
