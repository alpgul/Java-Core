package com.document.Thread_Scheduler;

/**
 * Java'daki iþ parçacýðý zamanlayýcýsý hangi iþ parçacýðýnýn çalýþmasý
 * gerektiðine karar veren JVM'nin parçasýdýr.
 * 
 * Ýþ parçacýðý zamanlayýcýsý tarafýndan çalýþtýrýlacak hangi iþlenebilir iþ
 * parçacýðýnýn seçileceðine dair bir garanti yoktur.
 * 
 * Tek seferde sadece bir iþ parçacýðý çalýþabilir.
 * 
 * Ýþ parçacýðý zamanlayýcýsý çoðunlukla iþ parçacýðý zamanlamak için önleyici
 * veya zaman dilimleme zamanlama kullanýr.
 */
public class App {

}
/**
 * Zaman dilimleri ile engelleyici zamanlama arasýndaki fark:
 * 
 * Önleyici zamanlama altýnda en yüksek öncelikli görev veya ölü durumlara
 * girene kadar veya daha yüksek öncelikli bir görev gerçekleþene kadar
 * yürütülür.
 * 
 * Zaman dilimleme altýnda bir görev önceden tanýmlanmýþ bir zaman dilimi için
 * yürütür ve daha sonra hazýr görevlerin havuzunu yeniden birleþtirir.
 * 
 * Zamanlayýcý daha sonra hangi görevin önceliðe ve diðer faktörlere baðlý
 * olarak yürütüleceðini belirler.
 */
