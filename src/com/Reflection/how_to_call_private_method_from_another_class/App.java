package com.Reflection.how_to_call_private_method_from_another_class;

import java.lang.reflect.*;

/*
 * Java'da başka bir sınıftan özel yöntem nasıl çağrılır:
 * Sınıfın çalışma zamanı davranışını değiştirerek sınıfın dışından özel yöntemi çağırabilirsiniz.
 * Java.lang.Class sınıfının ve java.lang.reflect.Method sınıfının yardımıyla, başka bir sınıftan özel yöntem çağırabiliriz.
 * Yöntem sınıfı için gerekli yöntemler:
 * 1) public void setAccessible (boole durumu) atar SecurityException , yöntemin erişilebilirliğini ayarlar.
 * 2) public Object invoke (Object metodu, Object ... args), AggalAccessException, IllegalArgumentException, InvocationTargetException yöntemini çağırmak için kullanılır.
 * Sınıf sınıfı için gerekli yöntem:
 * 1) public Method getDeclaredMethod (String name, Class [] parameterTypes) NoSuchMethodException, SecurityException öğesini atar: bu Class nesnesinin temsil ettiği sınıf veya arabirimin belirtilen bildirilen yöntemini yansıtan bir Method nesnesi döndürür.
 */
 class A {  
  private void message(){System.out.println("hello java"); }  
  private void cube(int n){System.out.println(n*n*n);}  
}  
public class App {
    //Başka bir sınıftan özel yöntem çağırma örneği
    public static void main(String[] args)throws Exception{  
  try {
     Class c = Class.forName("A");  
    Object o= c.newInstance();  
    Method m =c.getDeclaredMethod("message", null);  
    m.setAccessible(true);  
    m.invoke(o, null);  
} catch (Exception e) {
    // TODO: handle exception
}

//Başka bir sınıftan parametreli özel yöntem aramak için başka bir örnek
try {
   Class c=A.class;  
Object obj=c.newInstance();  
  
Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
m.setAccessible(true);  
m.invoke(obj,4);   
} catch (Exception e) {
    // TODO: handle exception
}
   
}  
}
