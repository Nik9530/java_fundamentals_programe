												// by extending Thread class 

package threads;

import java.util.Scanner;

//class name that extends the Thread class by Inheritance 
public class ThreadUsingExtendingThreadClass extends Thread

{	// main method
	public static void main(String args[])
	
	{
		//creating object of main class
		thread1 obj=new thread1();
		
		//calling run method by Start() method cause it invoke by Start() method 
		obj.start();
		
	}
	
	// run method to add two user values 
	public void run()
	{
		int num1,num2,sum;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter your first num. ");
		num1=sc.nextInt();
		System.out.println("Enter your Second num. ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The sum of numbers is "+sum);
		
	}
	
}
