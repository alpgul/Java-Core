package com.JAVA_I_O.Console;

import java.io.Console;
/*
 * Konsoldan giriş almak için Java Console sınıfı kullanılır. 
 * Metinleri ve şifreleri okumak için yöntemler sağlar.
 * Console sınıfını kullanarak şifre okursanız, kullanıcıya gösterilmez.
 * singleton instance of Console class.
 * 
 * Metodlar:
 * Reader reader()	Konsolla ilişkili okuyucu nesnesini almak için kullanılır
 * String readLine()	Konsoldan tek bir metin satırı okumak için kullanılır.
 * String readLine(String fmt, Object... args)	Biçimlendirilmiş bir istemi, daha sonra konsoldaki tek metin satırını okur.
 * char[] readPassword()	Konsolda görüntülenmeyen şifreyi okumak için kullanılır.
 * char[] readPassword(String fmt, Object... args)	Biçimlendirilmiş bir istemi, daha sonra konsolda görüntülenmeyen parolayı okur.
 * Console format(String fmt, Object... args)	Konsol çıktı akışına biçimlendirilmiş bir dize yazmak için kullanılır .
 * Console printf(String format, Object... args)	Konsol çıkış akışına bir dize yazmak için kullanılır.
 * PrintWriter writer()	Konsolla ilişkilendirilmiş PrintWriter nesnesini almak için kullanılır .
 * void flush()	Konsoldaki tüm veriyi basar ve temizler
 */
public class App {
    public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("Welcome "+n);    
System.out.println("Enter password: ");    
char[] ch=c.readPassword();    
String pass=String.valueOf(ch);//converting char array into string    
System.out.println("Password is: "+pass);  
}  
}
