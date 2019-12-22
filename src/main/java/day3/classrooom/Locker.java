package day3.classrooom;

import java.util.ArrayList;
import java.util.List;

public class Locker {
	
	private List<Mobile> mobileList = new ArrayList<Mobile>();
	
	public void lockMobile(Mobile mobile) {
		mobile.calls();
		mobile.messages();
		mobileList.add(mobile);
	}

	public List<Mobile> getMobileList() {
		return mobileList;
	}
	
}
