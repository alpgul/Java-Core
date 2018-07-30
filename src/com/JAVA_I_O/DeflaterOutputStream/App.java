package com.JAVA_I_O.DeflaterOutputStream;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

/*
 * DeflaterOutputStream sınıfı, deflate sıkıştırma biçimindeki verileri sıkıştırmak için kullanılır. 
 * GZIPOutputStream gibi diğer sıkıştırma filtrelerine olanak sağlar.
 * 
 */
public class App {
    public static void main(String args[]){  
try{  
FileInputStream fin=new FileInputStream("Deflater.java");  
FileOutputStream fout=new FileOutputStream("def.txt");  
DeflaterOutputStream out=new DeflaterOutputStream(fout);  
  
int i;  
while((i=fin.read())!=-1){  
out.write((byte)i);  
out.flush();  
}  
fin.close();  
out.close();  
}catch(Exception e){System.out.println(e);}  
System.out.println("rest of the code");  
}  
}
