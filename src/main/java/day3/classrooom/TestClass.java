package day3.classrooom;

public class TestClass {

	public static void main(String[] args) {
		Locker locker = new Locker();
		
		Mobile gayathriMobile = new MyMobile();
		locker.lockMobile(gayathriMobile);
		
		Mobile sekharMobile = new Redmi();
		locker.lockMobile(sekharMobile);
		
		Mobile manoharMobile = new ManoharMobile();
		locker.lockMobile(manoharMobile);
		
		//System.out.println(locker.getMobileList());
		
		Security security = new Security();
		security.checkMobile(locker.getMobileList());
		
	}	
	

}
