package com.document.Thread_Scheduler;

/**
 * Java'daki i� par�ac��� zamanlay�c�s� hangi i� par�ac���n�n �al��mas�
 * gerekti�ine karar veren JVM'nin par�as�d�r.
 * 
 * �� par�ac��� zamanlay�c�s� taraf�ndan �al��t�r�lacak hangi i�lenebilir i�
 * par�ac���n�n se�ilece�ine dair bir garanti yoktur.
 * 
 * Tek seferde sadece bir i� par�ac��� �al��abilir.
 * 
 * �� par�ac��� zamanlay�c�s� �o�unlukla i� par�ac��� zamanlamak i�in �nleyici
 * veya zaman dilimleme zamanlama kullan�r.
 */
public class App {

}
/**
 * Zaman dilimleri ile engelleyici zamanlama aras�ndaki fark:
 * 
 * �nleyici zamanlama alt�nda en y�ksek �ncelikli g�rev veya �l� durumlara
 * girene kadar veya daha y�ksek �ncelikli bir g�rev ger�ekle�ene kadar
 * y�r�t�l�r.
 * 
 * Zaman dilimleme alt�nda bir g�rev �nceden tan�mlanm�� bir zaman dilimi i�in
 * y�r�t�r ve daha sonra haz�r g�revlerin havuzunu yeniden birle�tirir.
 * 
 * Zamanlay�c� daha sonra hangi g�revin �nceli�e ve di�er fakt�rlere ba�l�
 * olarak y�r�t�lece�ini belirler.
 */
