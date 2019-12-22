package day3.classrooom;

import java.util.List;

public class Security {

	public void checkMobile(List<Mobile> mobileList) {
		for(Mobile mobile: mobileList) {
			mobile.calls();
			mobile.messages();
			
			if(ManoharMobile.class.isInstance(mobile)) {
				((ManoharMobile) mobile).manoharMobileConfiguration();
			}
		}
	}
}
