package com.JAVA_I_O.File;

import java.io.*;

/*
 * Dosya sınıfı, dosya ve dizin yolu adının soyut bir temsilidir. 
 * Bir yol adı mutlak veya göreli olabilir.Dosya sınıfı, dizinler veya dosyalar oluşturma, dizinleri veya dosyaları yeniden adlandırma 
 *  yeniden adlandırma, bir dizinin içeriğini listeleme, vb. Gibi dizinler ve dosyalar ile 
 *  çalışmak için çeşitli yöntemlere sahiptir.
 * 
 * Alanlar:
 * static	String	pathSeparator	Kolaylık için bir dize olarak gösterilen sistem bağımlı yol ayırıcı karakteridir .
 * static	char	pathSeparatorChar	Sistem bağımlı yol ayırıcı karakteridir.
 * static	String	separator	Kolaylık için bir dize olarak gösterilen sistem bağımlı varsayılan ad-ayırıcı karakteridir.
 * static	char	separatorChar	Sisteme bağlı varsayılan ad-ayırıcı karakteridir. 
 * 
 * Kurucular:
 * File(File parent, String child)	Bir üst soyut yol adından ve bir alt yol adı dizesinden yeni bir Dosya örneği oluşturur.
 * File(String pathname)	Verilen yol adı dizesini soyut bir yol adına dönüştürerek yeni bir Dosya örneği oluşturur.
 * File(String parent, String child)	Bir üst yol adı dizesi ve bir alt yol adı dizesinden yeni bir Dosya örneği oluşturur.
 * File(URI uri)	Verilen dosyayı dönüştürerek yeni bir Dosya örneği oluşturur: URI soyut bir yol adında.
 * 
 * Metodlar:
 * static File	createTempFile(String prefix, String suffix)	Varsayılan geçici dosya dizininde boş bir dosya oluşturur, adını oluşturmak için belirtilen prefix ve suffix kullanılır.
 * boolean	createNewFile()	Bu soyut yol adı ile adlandırılan yeni ve boş bir dosyayı atomik olarak ve sadece bu isimde bir dosya henüz mevcut değilse oluşturur.
 * boolean	canWrite()	Uygulamanın bu soyut yol adıyla belirtilen dosyayı değiştirip değiştiremeyeceğini test eder.
 * boolean	canExecute()	Uygulamanın bu soyut yol adı ile belirtilen dosyayı calışabileceğini test eder.
 * boolean	canRead()	Uygulamanın bu soyut yol adıyla belirtilen dosyayı okuyabilip edemeyeceğini test eder.
 * boolean	isAbsolute()	Bu soyut yol adının mutlak olup olmadığını sınar.
 * boolean	isDirectory()	Bu soyut yol adı ile belirtilen dosyanın bir dizin olup olmadığını sınar.
 * boolean	isFile()	Bu soyut yol adı ile belirtilen dosyanın normal bir dosya olup olmadığını sınar.
 * String	getName()	Bu soyut yol adı ile belirtilen dosyanın veya dizinin adını döndürür.
 * String	getParent()	Bu soyut yol adının üst öğesinin yol adı dizesini döndürür, yoksa bu yol adı bir üst dizin belirtmezse null döner.
 * Path	toPath()	Bu soyut yoldan oluşturulmuş bir java.nio.file.Path nesnesi döndürür.
 * URI	toURI()	Bir dosya oluşturur: Bu soyut yol adını temsil eden URI.
 * File[]	listFiles()	Bu soyut yol adı ile belirtilen dizindeki dosyaları ifade eden bir dizi soyut yol adı döndürür.
 * long	getFreeSpace()	Bu soyut yol adıyla adlandırılan bölümdeki ayrılmamış baytların sayısını döndürür.
 * String[]	list(FilenameFilter filter)	Belirtilen filtreyi karşılayan bu soyut yol adı ile belirtilen dizindeki dosya ve dizinleri adlandıran bir dizi dizge döndürür.
 * boolean	mkdir()	Bu soyut yol adıyla adlandırılan dizini oluşturur.
 */
public class App {
    public static void main(String[] args) {  
  //Java Dosyası Örneği 1
        try {  
            File file = new File("javaFile123.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        //Java Dosyası Örneği 2
        String path = "";  
        boolean bool = false;  
        try {  
            // createing  new files  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println(file);  
            // createing new canonical from file object  
            File file2 = file.getCanonicalFile();  
            // returns true if the file exists  
            System.out.println(file2);  
            bool = file2.exists();  
            // returns absolute pathname  
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            // if file exists  
            if (bool) {  
                // prints  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            // if any error occurs  
            e.printStackTrace();  
        }  
        //Java Dosyası Örneği 3
         File f=new File("/Users/sonoojaiswal/Documents");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename);  
    }  
    //Java Dosyası Örneği 4
    File dir=new File("/Users/sonoojaiswal/Documents");  
    File files[]=dir.listFiles();  
    for(File file:files){  
        System.out.println(file.getName()+" Can Write: "+file.canWrite()+
        "Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
    } 
  
    }  
}

