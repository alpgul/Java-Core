package com.document.Life_cycle_of_a_Thread;

/*Thread Yaþam Döngüsü
 * 5 adet aþama vardýr.
 * 1.New
 * 2.Runnable
 * 3.Running
 * 4.Non-Runnable(blocked)
 * 5.Terminated
 * New:
 * Start() metodu çaðrýmýndan önce yeni bir thread instance oluþturmalýyýz.
 * Runnable:
 * Start metodu çaðrýmýndan sonradýr fakat çalýþan iþ parçacýðý olarak zamanlayýcý tarafýndan seçilmemiþtir.
 * Running:
 * Zamanlayýcý tarafýndan seçilmiþ çalýþan iþ parcacýðýdýr.
 * Non-Runnable:(sleep,block on i/o, wait for lock,suspend,wait)
 * Bu iþ parçacýðýnýn hala çalýþabileceði ama þuan çalmaya uygun olmadýðý aþamadýr.
 * Terminated:
 * Ýþ parçacýðýnýn sonlandýrýldýðý aþamadýr.(run() method exits)
 * */
public class App {

}
