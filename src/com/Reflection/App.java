package com.Reflection;
/*
 * Java Reflection , çalışma zamanında bir sınıfın çalışma süresi davranışını incelemek veya değiştirmek için kullanılan bir işlemdir .
 * Java.lang.Class sınıfı, meta almak incelemek ve bir sınıfın çalışma zamanı davranışını değiştirmek için kullanılabilecek birçok yöntem sağlar.
 * Reflection API'si esas olarak kullanılır:
 * IDE (Entegre Geliştirme Ortamı), örneğin Eclipse, MyEclipse, NetBeans vb.
 * Debugger
 * Test Araçları vb.
 * 
 * java.lang.Class sınıfı:
 * Java.lang.Class sınıfı çoğunlukla iki görevi gerçekleştirir:
 * Çalışma zamanında bir sınıfın meta verilerini almak için yöntemler sağlar.
 * Bir sınıfın çalışma süresi davranışını incelemek ve değiştirmek için yöntemler sağlar.
 * 
 * Sık kullanılan Methodlar:
 * 1) public String getName()	sınıf adını döndürür
 * 2) public static Class forName(String className)throws ClassNotFoundException	sınıfı yükler ve Class sınıfının başvurusunu döndürür.
 * 3) public Object newInstance()throws InstantiationException,IllegalAccessException	yeni örneği oluşturur.
 * 4) public boolean isInterface()	arayüz olup olmadığını kontrol eder.
 * 5) public boolean isArray()	dizi olup olmadığını kontrol eder.
 * 6) public boolean isPrimitive()	ilkel veri tipi olup olmadığını kontrol eder.
 * 7) public Class getSuperclass()	superclass sınıf referansını döndürür.
 * 8) public Field[] getDeclaredFields()throws SecurityException	Bu sınıfın toplam alan(değişken) sayısını döndürür.
 * 9) public Method[] getDeclaredMethods()throws SecurityException	Bu sınıfın toplam yöntem sayısını döndürür.
 * 10) public Constructor[] getDeclaredConstructors()throws SecurityException	Bu sınıfın toplam kurucu sayısını verir.
 * 11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException	metodun sınıfı orneği döndürür.
 * 
 * Sınıfı Oluşturmak için 3 farklı yöntem vardır:
 * Sınıf  forName () yöntemi
 * Object sınıfının getClass () yöntemi
 * .class sözdizimi
 * 
 * Sınıf Nesnesi sınıf nesnesini belirlemede kullanılır:
 * 1) public boolean isInterface (): belirtilen Class nesnesinin bir arabirim türünü temsil edip etmediğini belirler.
 * 2) public boolean isArray (): bu Class nesnesinin bir dizi sınıfını temsil edip etmediğini belirler.
 * 3) public boolean isPrimitive (): belirtilen Class nesnesinin ilkel bir türü temsil edip etmediğini belirler.
 */
class Simple{}  
interface My{}   
public class App {
     void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName());  
  }
    public static void main(String[] args) {
        //1) Class sınıfının forName () yöntemi
        /*
         * sınıfı dinamik olarak yüklemek için kullanılır.
         * Class sınıfının örneğini döndürür.
         * Sınıfın tam adını biliyorsanız, kullanılmalıdır. İlkel türler için kullanılamaz.
         */
         try {
            Class c=Class.forName("Simple");            
  System.out.println(c.getName());  
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
        }; 
        //2) Object sınıfının getClass () yöntemi
        /*
         * Sınıfı örneğini döndürür. Türü biliyorsanız, kullanılmalıdır.
         * Ilkel verilerle birlikte kullanılabilir.
         */
        Simple s=new Simple();     
   App t=new App();  
   t.printName(s);  
   
   //3) .class sözdizimi
   /*
    * Ancak örnek yoksa o zaman türün adını ".class" ekleyerek bir Sınıf elde etmek mümkündür.
    * primitive veri türleri için de kullanılabilir.
    */
        Class c = boolean.class;   
   System.out.println(c.getName());  
  
   Class c2 = App.class;   
   System.out.println(c2.getName());  
   
   //Nesne tipini belirlemek için basit Reflection api örneği.
   try{  
   Class c3=Class.forName("Simple");  
   System.out.println(c.isInterface());  
     
   Class c4=Class.forName("My");  
   System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
   
    }
     
}
