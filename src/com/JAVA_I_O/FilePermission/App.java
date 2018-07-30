package com.JAVA_I_O.FilePermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/*
 * FilePermission : 
 *
 * Java FilePermission sınıfı bir dizine veya dosyaya ilişkin izni içerir .
 * Tüm izinler yol ile ilgilidir. Yol iki tür olabilir:
 * 1) D:\\IO\\-: İzin, tüm alt dizinleri ve dosyaları yinelemeli olarak ilişkilendirildiğini gösterir.
 * 2) D:\\IO\\*: Bu dizinde, alt dizinler hariç olmak üzere, bu dizindeki tüm dizin ve dosyalarla ilişkili olduğunu gösterir.
 * Metodları:
 * int hashCode()	Bir nesnenin hash kod değerini döndürmek için kullanılır .
 * String getActions()	Bir eylemin "kanonik dize temsili" ni döndürmek için kullanılır.
 * boolean equals(Object obj)	Eşitlik için iki FilePermission nesnesini kontrol etmek için kullanılır.
 * boolean implies(Permission p)	Belirtilen izin için FilePermission nesnesini denetlemek için kullanılır.
 * PermissionCollection newPermissionCollection()	FilePermission nesnesini depolamak için yeni PermissonCollection nesnesini döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) throws IOException {  
        String srg = "D:\\IO Package\\java.txt";  
        FilePermission file1 = new FilePermission("D:\\IO Package\\-", "read");  
        PermissionCollection permission = file1.newPermissionCollection();  
        permission.add(file1);  
             FilePermission file2 = new FilePermission(srg, "write");  
             permission.add(file2);  
             if(permission.implies(new FilePermission(srg, "read,write"))) {  
             System.out.println("Read, Write permission is granted for the path "+srg );  
             }else {  
            System.out.println("No Read, Write permission is granted for the path "+srg);            }  
       }   
}
