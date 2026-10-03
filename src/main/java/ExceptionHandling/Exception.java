package ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		
		/*try {
			int c=a/b; //Risky line of code
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Error!!! not visible");
		}*/
		try {
			int arr[]={1,2,3,4,5};
			//int d=arr.length
			System.out.println(arr[7]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error!!! not visible");
		}
		}

}
