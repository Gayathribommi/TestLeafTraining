package gayathri.practice.college;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		
	
 List<College> collegeList = new ArrayList<>();
 College psg = new Psg();
 psg.setCollegeFees(10000);
 psg.setCollegeName("Vit");
 psg.setNoOfStudents(500);
 
 collegeList.add(psg);
}

}