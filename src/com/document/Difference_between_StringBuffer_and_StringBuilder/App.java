package com.document.Difference_between_StringBuffer_and_StringBuilder;

/*No.	StringBuffer	StringBuilder
1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	senkron oldugundan method 2 thread caðýramaz
StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously. Birden fazla thread çaðýrabilir.
2)	StringBuffer is less efficient than StringBuilder.	Az verimli
StringBuilder is more efficient than StringBuffer çok verimli*/
public class App {

	public static void main(String[] args) {

		// StringBuffer Example
		StringBuffer buffer = new StringBuffer("hello");
		buffer.append("java");
		System.out.println(buffer);

		// StringBuilder Example
		StringBuilder builder = new StringBuilder("hello");
		builder.append("java");
		System.out.println(builder);
		// Performance Test of StringBuffer and StringBuilder
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	}
}
