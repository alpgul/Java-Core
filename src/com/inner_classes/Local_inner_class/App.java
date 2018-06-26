package com.inner_classes.Local_inner_class;

/**
 * Method i�inde tan�mlan�r Sadece tan�mlanan method i�inden ula��l�r local
 * inner s�n�f� tan�mland�ktan sonra �a�r�m yap�l�r d�� kapsayan s�n�f�n tum
 * de�erlerine ve metodlar�na ula��labilir �rnekteki de�er: {@link App#data}
 */
public class App {

	private int data = 30;// instance variable

	public void helper() {

	}

	public void display() {

/*
 * Kapsayan methodun Local final de�i�kenlere ve effectively final (sadece jdk8 ve �st versionlar�nda local eri�im var) de�i�kenlere ula��labilir.
 */
		String outerLocalVariable = "I am outer local variable";
		final String finalOuterLocalVariable = "I am final outer local variable";
		class Local {

/*
 * Static variable tan�mlamada sadece final keyword ile tan�mlanabilir
 * Static method tan�mlamas� hi�bir �ekilde yap�lamaz*/
			final static String finalStaticLocalVariable = "test";

			// static String staticLocalVariable="I am static local variable";

			// private static void localInnerMethod()

			// private static final void localInnerMethod()
			void msg() {

				System.out.println(finalOuterLocalVariable);
				System.out.println(outerLocalVariable);
				helper();
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();

		/*
		 * Local inner abstract ve final class tan�mlanabilir.
		 * private, protected,public eri�im belirleyicileri tan�mlanmaz.*/
		abstract class AbstractLocalInner {

		}

		class SubLocalInner extends
				AbstractLocalInner {

		}

		final class FinalClass {

		}
		// class SubLocalInner2 extends FinalClass
	}

	/*
	 * Static method i�inde inner class tan�mlanabilir.*/
	public static void main(String args[]) {

		class LocalInner {
		}
		LocalInner localInner = new LocalInner();
		App obj = new App();
		obj.display();
	}
}

// Derleme Sonucu
/*import java.io.PrintStream;  
class localInner1$Local  
{  
    final localInner1 this$0;  
    localInner1$Local()  
    {     
        super();  
        this$0 = Simple.this;  
    }  
    void msg()  
    {  
        System.out.println(localInner1.access$000(localInner1.this));  
    }  
}  
*/
