package com.Networking.URLConnection;

import java.io.InputStream;
import java.net.*;

/*
 * Java URLConnection sınıf URL ve uygulaması arasında bir iletişim bağlantısını temsil eder.
 * Bu sınıf, URL tarafından belirtilen belirtilen kaynağa veri okumak ve yazmak için kullanılabilir.
 * URLConnection sınıfı birçok yöntem sağlar, bir web sayfasının tüm verilerini getInputStream () yöntemini kullanarak görüntüleyebiliriz. 
 * GetInputStream () yöntemi, okunan ve görüntülenen akışta belirtilen URL'nin tüm verilerini döndürür.
 * 
 */
public class App {
    public static void main(String[] args){  
try{  
URL url=new URL("http://www.javatpoint.com/java-tutorial");  
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  
}catch(Exception e){System.out.println(e);}  
}
}
