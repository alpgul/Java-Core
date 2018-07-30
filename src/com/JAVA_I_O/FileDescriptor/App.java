package com.JAVA_I_O.FileDescriptor;

import java.io.*;

/*
 * 
 * FileDescriptor sınıfı, açık bir dosyayı, açık bir yuvayı veya başka bir bayt kaynağını veya baytını temsil eden temel makineye özgü yapıya yönelik bir tanıtıcı görevi görür . 
 * Err, in veya out  olabilir
 * FileDescriptor sınıfı, onu içerecek bir FileInputStream veya FileOutputStream oluşturmak için kullanılır .
 * 
 * Alanlar:
 * static	FileDescriptor	err	Standart hata akışının bir kolu.
 * static	FileDescriptor	in	Standart giriş akışına bir kolu.
 * static	FileDescriptor	out Standart çıktı akışına bir kolu.
 * Metodlar:
 * void	sync()	Tüm sistem arabelleklerini altta yatan diske eşitlemeye zorlar.
 * boolean	valid()	Bu dosya tanıtıcı nesnesinin geçerli olup olmadığını sınar.
 */
public class App {
    public static void main(String[] args) {  
        FileDescriptor fd = null;  
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };  
        try  {  
            FileOutputStream fos = new FileOutputStream("Record.txt");  
            FileInputStream fis = new FileInputStream("Record.txt");  
            fd = fos.getFD();  
            fos.write(b);  
            fos.flush();  
            fd.sync();// confirms data to be written to the disk  
            int value = 0;  
            // for every available bytes  
            while ((value = fis.read()) != -1) {  
                char c = (char) value;// converts bytes to char  
                System.out.print(c);  
            }  
            System.out.println("\nSync() successfully executed!!");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
