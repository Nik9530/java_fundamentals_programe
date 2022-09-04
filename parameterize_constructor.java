package constructor;

public class parameterize_constructor 
{
	String name;
	int id;
	parameterize_constructor (String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String args[])
	{	
		parameterize_constructor de=new parameterize_constructor("Nihkil",11);
		System.out.println("Emp name is " +de.name+ " Emp id is "+de.id);
	}
	
}
