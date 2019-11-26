package day1.classroom;

public class Mobile {
	public String makeCall(int phno) {
		System.out.println(phno);
		return "answered/declined";
		
	}
	public void sendText() {
		System.out.println("The mesage is sent/declined");
		
	}
	public void shutDonw() {
		System.out.println("The mobile is shutdown");
		
	}
	
	public void whatsapp(int number) {
		System.out.println(number);
		
		
	}
public static void main(String[] args) {
	 Mobile obj = new Mobile();
	 
	 String makeCall = obj.makeCall(866786);
	 System.out.println(makeCall);
	 obj.sendText();
	 obj.shutDonw();
	 obj.whatsapp(99999);

}

}
