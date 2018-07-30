package com.JAVA_I_O.ObjectStreamField;

import java.io.ObjectStreamClass;

/*
 *  Bir sınıfın Seri hale getirilebilir alanlarını bildirmek için 
 * bir dizi ObjectStreamFields kullanılır.Java.io.ObjectStreamClass.getField (String name)
 * Kurucular:
 * ObjectStreamField(String name, Class<?> type)	Belirtilen tipte ve isimde bir seri hale getirilebilir alan oluşturur.
 * ObjectStreamField(String name, Class<?> type, boolean unshared)	Verilen isim ve türle birlikte  paylaşılan olmadıgı belirtilerek bir seri hale getirilebilir alanı temsil eden bir ObjectStreamField oluşturur.
 * 
 * Metodlar:
 * int	compareTo(Object obj)	Bu alanı başka bir ObjectStreamField ile karşılaştırır.
 * String	getName()		Bu alanın adını alır.
 * int	GetOffset(	Örnek veri içindeki alan ofseti.
 * Class<?>	getType()		Alanın türünü alır.
 * char	getTypeCode()	Alan tipinde karakter kodlamasını döndürür.
 * String	getTypeString()	JVM tipi imzayı döndürür .
 * boolean	isPrimitive()	Bu alanın ilkel bir türü varsa doğrudur.boolean data type(byte char short int long float double)
 * boolean	isUnshared()	Bu ObjectStreamField örneği tarafından temsil edilen seri hale getirilebilir alanın paylaşılmamış olup olmadığını belirten boolean değerini döndürür.
 * protected void	setOffset(int offset)	Oluşturulan İnstance verilerde ofset.
 * String	toString()	Bu alanı açıklayan bir string döndürür .
 * 
 * public char getTypeCode()


Alan tipindeki karakter kodlamasını döndürür. Kodlama şu şekildedir:

B	byte
C	char
D	double
F	float
I	int
J	long
L	class or interface
S	short
Z	boolean
[	array
 */
public class App {
    public static void main(String[] args) {  
             
          // create a new object stream class for Integers  
          ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);  
  
          // get the value field from ObjectStreamClass for integers  
          System.out.println("" + osc.getField("value"));  
  
          // create a new object stream class for Calendar  
          ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);  
  
          // get the Class instance for osc2  
          System.out.println("" + osc2.getField("isTimeSet"));  
  
       }
}
class Calendar{}