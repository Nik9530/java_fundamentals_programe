package threads;
import java.util.*;
public class threads
{
	int min,max;
	public static void main(String args[])
	{
		threads obj=new threads();
		obj.accept();
		obj.run();
	}
	
	 public void accept()
	 {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter your smallest no. ");
		 min=sc.nextInt();
		 System.out.println("Enter your largest no. ");
		 max=sc.nextInt();
	 }
	public void run()
	{
		for(int i=min;i<max;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers between above numbers are "+i);
			}	
		}
		System.out.println();
		for(int j=min;j<max;j++)
		{
			if(j%2!=0)
			{
				System.out.println("Odd numbers between above numbers are "+j);
			}
		}
	}
}

	

