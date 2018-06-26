package com.String.StringTokenizer;

import java.util.StringTokenizer;

/*StringTokenizer(String str) belirtilen string ifadeyle stringtokenizer olu�tur
 * StringTokenizer(String str, String delim) string ifade ve s�n�rlay�c� ile olu�tur
 * StringTokenizer(String str, String delim, boolean returnValue) strinf ifade s�n�rlay�c� ve e�er true donerse s�n�rlay�c�y� dahil bir token false ise s�n�rlay�c� haric token olusur
 * */
public class App {

	public static void main(String[] args) {

		// Simple example of StringTokenizer class
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		// token say�s�n� d�nderir her nexttokenda de�er azal�r
		System.out.println(st.countTokens());
		// sonraki token ifade varm� kontrol eder
		while (st.hasMoreTokens()) {
			// e�er varsa o token ifade d�ner ve sonraki tokena gider
			System.out.println(st.nextToken());
		}
	}
}
