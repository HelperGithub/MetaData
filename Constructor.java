class Constructor
{
	public static void main(String args[])
	{
		person p1 = new person();
		person p2 = new person("Rasika",23);
		person p3 = new person(p2);
		
				
		System.out.println("p1 --> ");p1.showData();
		System.out.println("p2 --> ");p2.showData();
		System.out.println("p3 --> ");p3.showData();
	}	
}

class person
{
	String name;
	int age;
	
	person()
	{
		name = null;
		age  = 0;	
	}	
	
	person(String n,int a)
	{
		name = n;
		age  = a;
	}	
	
	person(person ob)
	{
			name = ob.name;
			age  = ob.age;		
	}
	void showData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age  = "+age);
		System.out.println("\n");
		
	}
}
