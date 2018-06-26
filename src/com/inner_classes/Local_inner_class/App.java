package com.inner_classes.Local_inner_class;

/**
 * Method içinde tanýmlanýr Sadece tanýmlanan method içinden ulaþýlýr local
 * inner sýnýfý tanýmlandýktan sonra çaðrým yapýlýr dýþ kapsayan sýnýfýn tum
 * deðerlerine ve metodlarýna ulaþýlabilir örnekteki deðer: {@link App#data}
 */
public class App {

	private int data = 30;// instance variable

	public void helper() {

	}

	public void display() {

/*
 * Kapsayan methodun Local final deðiþkenlere ve effectively final (sadece jdk8 ve üst versionlarýnda local eriþim var) deðiþkenlere ulaþýlabilir.
 */
		String outerLocalVariable = "I am outer local variable";
		final String finalOuterLocalVariable = "I am final outer local variable";
		class Local {

/*
 * Static variable tanýmlamada sadece final keyword ile tanýmlanabilir
 * Static method tanýmlamasý hiçbir þekilde yapýlamaz*/
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
		 * Local inner abstract ve final class tanýmlanabilir.
		 * private, protected,public eriþim belirleyicileri tanýmlanmaz.*/
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
	 * Static method içinde inner class tanýmlanabilir.*/
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
