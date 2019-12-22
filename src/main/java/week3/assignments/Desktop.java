package week3.assignments;

public class Desktop implements Software, HardWare {
	
	public void desktopModel() {
		System.out.println("this is the method from this Class");

	}

	@Override
	public void hardwareResources() {
		System.out.println("this is the implemented method for hardwareresources");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("this is the implemented method for softwareresources");
		
	}

}
