package com.JAVA_I_O.Scanner;

import java.util.Scanner;

/*
 * Klavyeden girişi okumak için çeşitli yollar vardır, java.util.Scanner sınıfı bunlardan biridir.
 * Java Tarayıcı sınıfı boşluk bydefault olan bir ayırıcı kullanılarak dizgeciklerine girişini keser. Çeşitli ilkel değerleri okumak ve ayrıştırmak için birçok yöntem sunar.
 * Java Scanner sınıfı, düzenli ifadeyi kullanarak dize ve ilkel türler için metni ayrıştırmak için yaygın olarak kullanılır.
 * Java Scanner sınıfı, Object sınıfını genişletir ve Iterator ve Closeable arabirimlerini uygular.
 * 
 * Metodlar:
 * public String next()	tarayıcıdan sonraki belirteci döndürür.
 * public String nextLine()	Tarayıcı konumunu bir sonraki satıra taşır ve değeri bir dize olarak döndürür.
 * public byte nextByte()	sonraki belirteci bayt olarak tarar.
 * public short nextShort()	Bir sonraki belirteci short bir değer olarak tarar.
 * public int nextInt()	sonraki belirteci int değeri olarak tarar
 * public long nextLong()	Bir sonraki belirteci long bir değer olarak tarar.
 * public float nextFloat()	Bir sonraki belirteci float değeri olarak tarar.
 * public double nextDouble()	sonraki belirteci double değer olarak tarar.
 */
public class App {
    public static void main(String[] args) {
        //Konsoldan giriş almak için Java Tarayıcı Örneği
        Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter your rollno");  
   int rollno=sc.nextInt();  
   System.out.println("Enter your name");  
   String name=sc.next();  
   System.out.println("Enter your fee");  
   double fee=sc.nextDouble();  
   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
   sc.close();  
   //Ayrıştırıcıyla Java Tarayıcı Örneği
    String input = "10 tea 20 coffee 30 tea buiscuits";  
     Scanner s = new Scanner(input).useDelimiter("\\s");  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     s.close();   
    }
}
