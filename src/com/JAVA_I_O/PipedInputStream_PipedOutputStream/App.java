package com.JAVA_I_O.PipedInputStream_PipedOutputStream;

import java.io.*;

/*
 * PipedInputStream ve PipedOutputStream sınıfları, verileri aynı anda okumak ve yazmak için kullanılabilir. 
 * Her iki akış da PipedOutputStream sınıfının connect () yöntemi kullanılarak birbirine bağlanır.
 */
public class App {
    public static void main(String args[])throws Exception{  
final PipedOutputStream pout=new PipedOutputStream();  
final PipedInputStream pin=new PipedInputStream();  
  
pout.connect(pin);//connecting the streams  
//creating one thread t1 which writes the data  
Thread t1=new Thread(){  
public void run(){  
for(int i=65;i<=90;i++){  
try{  
pout.write(i);  
Thread.sleep(1000);  
}catch(Exception e){}  
}  
}  
};  
//creating another thread t2 which reads the data  
Thread t2=new Thread(){  
public void run(){  
try{   
for(int i=65;i<=90;i++)  
System.out.println(pin.read());  
}catch(Exception e){}  
}  
};  
//starting both threads  
t1.start();  
t2.start();  
}
}
