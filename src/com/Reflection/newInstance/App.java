package com.Reflection.newInstance;

/*
 * NewInstance ()  bir yöntem  sınıfı ve Yapıcı  sınıfı için yeni bir örneğini oluşturmak için kullanılır.
 */
class Simple{  
 void message(){System.out.println("Hello Java");}  
}  
public class App {
    //NewInstance () yöntemi örneği
    public static void main(String[] args) {
         try{  
  Class c=Class.forName("Simple");  
  Simple s=(Simple)c.newInstance();  
  s.message();  
  
  }catch(Exception e){System.out.println(e);}  
  
 }  
 }

