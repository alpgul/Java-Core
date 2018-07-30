package com.JAVA_I_O.ObjectStream;

import java.io.*;

/* ObjectStreamClass:
 * Sınıf için bir Serileştirme tanımlayıcısı görevi görür . 
Bu sınıf , sınıfın adını ve serialVersionUID değerini içerir.
Metodlar:
Class<?>	forClass()	Bu sürümün eşlendiği yerel sanal makinedeki sınıfı döndürür.
ObjectStreamField	getField(String name)	Sınıf alanını isme göre cağırır.
ObjectStreamField[]	getFields()	Seri hale getirilen sınıfın alanlarını bir dize şeklinde döndürür.
String	getName()	Sınıf tanımlayıcısının adını döndürür.
long	getSerialVersionUID()	Bu sınıf için serialVersionUID değerini döndürür.
Static ObjectStreamClass	lookup(Class<?> cl)	Serileştirilebilen bir sınıfın tanımlayıcısını bulur.
Static ObjectStreamClass	lookupAny(Class<?> cl)	Seri hale getirilip uygulanmadığına bakılmaksızın, herhangi bir sınıf için tanımlayıcıyı döndürür.
String	toString()	Bu ObjectStreamClass'ı tanımlayan bir dize döndürür.
 */
public class App {
    public static void main(String[] args) {  
  
        // create a new object stream class for Integers  
        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);  
  
        // get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("price"));  
  
        // create a new object stream class for Calendar  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
  
        // get the Class instance for osc2  
        System.out.println("" + osc2.getField("hash"));  
  
    } 
}
class SmartPhone{}