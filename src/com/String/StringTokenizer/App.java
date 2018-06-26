package com.String.StringTokenizer;

import java.util.StringTokenizer;

/*StringTokenizer(String str) belirtilen string ifadeyle stringtokenizer oluþtur
 * StringTokenizer(String str, String delim) string ifade ve sýnýrlayýcý ile oluþtur
 * StringTokenizer(String str, String delim, boolean returnValue) strinf ifade sýnýrlayýcý ve eðer true donerse sýnýrlayýcýyý dahil bir token false ise sýnýrlayýcý haric token olusur
 * */
public class App {

	public static void main(String[] args) {

		// Simple example of StringTokenizer class
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		// token sayýsýný dönderir her nexttokenda deðer azalýr
		System.out.println(st.countTokens());
		// sonraki token ifade varmý kontrol eder
		while (st.hasMoreTokens()) {
			// eðer varsa o token ifade döner ve sonraki tokena gider
			System.out.println(st.nextToken());
		}
	}
}
