package com.JAVA_I_O.RandomAccessFile;

import java.io.*;

/*
 * Bu sınıf rastgele erişim dosyasına okuma ve yazma için kullanılır. 
 * Rastgele bir erişim dosyası, geniş bir bayt dizisi gibi davranır . 
 * İmleç yazarak okuma yazma işlemlerini gerçekleştirerek, dosya tanıtıcısı denen diziye ima edilen bir imleç var . 
 * İstenilen sayıda bayt okunmadan önce dosya sonu ulaşırsa EOFException atılır . Bu bir IOException türüdür.
 * 
 * Kurucular:
 * RandomAccessFile(File file, String mode)	Dosya bağımsız değişkeniyle belirtilen dosyadan okumak ve isteğe bağlı olarak yazmak için rastgele bir erişim dosyası akışı oluşturur.
 * RandomAccessFile(String name, String mode)	Belirtilen ada sahip bir dosyadan okumak ve isteğe bağlı olarak yazmak için rastgele bir erişim dosyası akışı oluşturur.
 * Metodlar:
 * void	close()	Bu rastgele erişim dosyası akışını kapatır ve akışla ilişkili tüm sistem kaynaklarını serbest bırakır.
 * FileChannel	getChannel()	Bu dosyayla ilişkilendirilmiş benzersiz FileChannel nesnesini döndürür .
 * int	readInt()	Bu dosyadan işaretli bir 32 bit tam sayı okur.
 * String	readUTF()	Bu dosyadan bir dize okur.
 * void	seek(long pos)	Bir sonraki okuma veya yazma işleminin gerçekleştiği dosya başlangıcından ölçülen dosya-işaretçi ofsetini ayarlar.
 * void	writeDouble(double v)	Double argLongBits yöntemini kullanarak Double argLongBits yöntemini kullanarak çift argümanı uzun bir boyuta dönüştürür ve sonra bu uzun değeri dosyaya sekiz baytlık bir nicelik, yüksek bayt önce yazar.
 * void	writeFloat(float v)	FloatToIntBits yöntemini floatToIntBits yöntemini kullanarak Float değişkenini bir int'ye dönüştürür ve sonra bu int değerini dosyaya önce dört baytlık bir miktar, yüksek bayt olarak yazar.
 * void	write(int b)	Belirtilen bayt bu dosyaya yazar.
 * int	read()	Bu dosyadan bir bayt veri okur.
 * long	length()	Bu dosyanın uzunluğunu döndürür.
 * void	seek(long pos)	Bir sonraki okuma veya yazma işleminin gerçekleştiği dosya başlangıcından ölçülen dosya-işaretçi ofsetini ayarlar.
 */
public class App {  
    static final String FILEPATH ="myFile.TXT";  
    public static void main(String[] args) {  
        try {  
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
            writeToFile(FILEPATH, "I love my country and my people", 31);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  