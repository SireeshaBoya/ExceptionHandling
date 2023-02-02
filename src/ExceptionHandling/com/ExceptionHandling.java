
/*Exception Handling:
	The Exception Handling in Java is one of the powerful mechanism 
	to handle the runtime errors so that the normal flow of the application can be maintained.
Types of Exception handling:
	1.UnChecked Exception:
		The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
		Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
	2.Checked Exception:
		The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
		For example, IOException, SQLException, etc.
		Checked exceptions are checked at compile-time.*/

package ExceptionHandling.com;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program started");
		int a = 9;
		int b = 0;
		int results = 0;
		try {
			results = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("output is" + " " + results);
		System.out.println("program end");
	}
}
