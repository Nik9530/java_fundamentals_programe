										
													// by Runnable Interface  //

package threads;

import java.util.Scanner;

// class that implements runnable  
public class ThreadsByRunnableInterface implements Runnable
{
	// main method
	public static void main(String args[]) 
	{
		// creating object of class 
		ThreadsByRunnableInterface obj=new ThreadsByRunnableInterface();
		
		// creating object of the Thread class that is implementing runnable
		Thread th=new Thread(obj);
		
		// used start() method to invoke run method 
		th.start();
			
	}
	
	// run method to add two numbers 
	public void run()
	{
		// assigning variables 
		int num1,num2,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your first no. ");
		num1=s.nextInt();
		System.out.println("Enter your Second no. ");
		num2=s.nextInt();
		sum=num1+num2;
		System.out.println("The sum of numbers is "+sum);
		
	}
	

}
