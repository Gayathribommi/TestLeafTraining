package week3.assignments;

public class TestClass {
	public static void main(String[] args) {
		
		HardWare hd = new Desktop();
		hd.hardwareResources();
		Software sd = new Desktop();
		sd.softwareResources();
		((Desktop) sd).desktopModel();
	}

}
