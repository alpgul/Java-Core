package com.Strictfb;

/*
 * strictfp class A{}//strictfp applied on class  
 * 
strictfp interface M{}//strictfp applied on interface  

class A{  
		strictfp void m(){}//strictfp applied on method  
}  */
public class App {

	// her platformda ayný deðeri vermesi için kullanýlýr ondalýklý deðerlerde
	public strictfp float strictCalculate(float var1, float var2) {

		return var1 * var2;
	}

	public float calculate(float var1, float var2) {

		return var1 * var2;
	}

	public static void main(String[] args) {

		App instance = new App();

		System.out.println(instance.strictCalculate(Float.MIN_VALUE, 2.45f));
		System.out.println(instance.calculate(Float.MIN_VALUE, 2.45f));

	}
}
