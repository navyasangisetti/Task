package Exceptionhandling;

public class Main {

	    public static void main(String[] args) {
	        try{
	            int a=30,b=0;
	            int c=a/b;
	            System.out.println(c);
	        }
	        catch(ArithmeticException e){
	            System.out.println("Cannot divide by zero");
	        }
	        finally{
	            System.out.println("finally block will always executed");
	        }
	    }
}


