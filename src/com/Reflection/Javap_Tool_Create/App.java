package com.Reflection.Javap_Tool_Create;

import java.lang.reflect.*;

/*
 * public Field[] getDeclaredFields()throws SecurityException	Bu sınıf nesnesi tarafından temsil edilen sınıf veya arabirim tarafından bildirilen tüm alanları yansıtan bir dizi Alan nesnesi döndürür.
public Constructor[] getDeclaredConstructors()throws SecurityException	bu sınıf nesnesi tarafından temsil edilen sınıf tarafından bildirilen tüm yapıcıları yansıtan bir Oluşturucu nesneleri dizisi döndürür.
public Method[] getDeclaredMethods()throws SecurityException	Bu sınıf nesnesi tarafından temsil edilen sınıf veya arabirim tarafından bildirilen tüm yöntemleri yansıtan bir Yöntem nesneleri dizisi döndürür.
 */
public class App {
    //Javap aracı oluşturma örneği
    /*
     * Çalışma zamanında, herhangi bir sınıfın ayrıntılarını alabilirsiniz, 
     * kullanıcı tanımlı veya önceden tanımlanmış sınıf olabilir.
     * komut: java App java.lang.Object
     */
    public static void main(String[] args)throws Exception {  
    Class c=Class.forName(args[0]);  
      
    System.out.println("Fields........");  
    Field f[]=c.getDeclaredFields();  
    for(int i=0;i<f.length;i++)  
        System.out.println(f[i]);  
      
    System.out.println("Constructors........");  
    Constructor con[]=c.getDeclaredConstructors();  
    for(int i=0;i<con.length;i++)  
        System.out.println(con[i]);  
      
        System.out.println("Methods........");  
    Method m[]=c.getDeclaredMethods();  
    for(int i=0;i<m.length;i++)  
        System.out.println(m[i]);  
   }  
}
