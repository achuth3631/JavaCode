package InterfacePracticetwo;

public interface Laptop {
	
	public void cut();
	
	public void copy();
	
	public void paste();
	
	public void keyboard();
	
	default void security()
	{
		System.out.println("Laptop code executed");
	}
	
	static void charger()
	{
		System.out.println("charger code executed");
	}


}
