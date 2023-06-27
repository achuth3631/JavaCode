package InterfacePracticetwo;

public class Lenovo implements Laptop {

	
	public void cut() {

		System.out.println("Lenovo cut code");
	}

	
	public void copy() {
		System.out.println("Lenovo copy code");

	}

	
	public void paste() {

		System.out.println("Lenovo paste code");
	}

	
	public void keyboard() {
		System.out.println("Lenovo keyboard code");

	}
	
	public void camera()
	{
		System.out.println("Lenovo Camera code");
	}
	
	@Override
	public void security()
	{
		System.out.println("Lenovo Laptop code executed");

	}
}
