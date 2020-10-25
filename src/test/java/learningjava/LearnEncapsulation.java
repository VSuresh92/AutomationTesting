package learningjava;

public class LearnEncapsulation {

	private String name="Sathesh";
	private String number ="1111 2222 3333"; 
	
	public String getName()
	{
		return name;
	}
	public void setNameArg(String name)
	{
		this.name = name;
	}
	
	public void setName()
	{
		this.name = name;
	}
	
	public String getNumber()
	{
		return number;
	}
	public void setNumberArg(String number)
	{
		this.number = number;
	}
	public void setNumber()
	{
		this.number = number;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnEncapsulation obj = new LearnEncapsulation();
		obj.setName();
		System.out.println(obj.getName());
		
		obj.setNumber();
		System.out.println(obj.getNumber());
		
		obj.setNameArg("Suresh");
		System.out.println(obj.getName());
		
		obj.setNumberArg("123456");
		System.out.println(obj.getNumber());
		
	}

}
